package executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestExecutor {
    static int times = Times.FIVE.getValue();

    public static void main(String[] args) {
//        testSingle();
//        testCachedThreadPool();
//        testFixedThreadPool();
//        testScheduledTgreadPool();
        testCallable();
    }

    private static void testCallable() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> futureList = new ArrayList<>();
        runTestCallable(executorService, times, futureList);
        for (Future<String> future: futureList) {
            try{
                while (!future.isDone()); // Future 如果没完成,则循环一直等待,直到Future返回完成
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    private static void testScheduledTgreadPool() {
        /**
         * newScheduledThreadPool(int)
         * 调度型线程池
         * 这个池子里的线程可以按 schedule 依次 delay 执行，或周期执行
         */
        ExecutorService executorService = Executors.newScheduledThreadPool(times);
        runTestRunnable(executorService, times);

    }

    private static void testFixedThreadPool() {
        /**
         * newFixedThreadPool(int)
         * newFixedThreadPool 与 cacheThreadPool 差不多，也是能 reuse 就用，但不能随时建新的线程。
         * 其独特之处:任意时间点，最多只能有固定数目的活动线程存在，此时如果有新的线程要建立，只能放在另外的队列中等待，直到当前的线程中某个线程终止直接被移出池子。
         * 和 cacheThreadPool 不同，FixedThreadPool 没有 IDLE 机制（可能也有，但既然文档没提，肯定非常长，类似依赖上层的 TCP 或 UDP IDLE 机制之类的），所以 FixedThreadPool 多数针对一些很稳定很固定的正规并发线程，多用于服务器。
         * 从方法的源代码看，cache池和fixed 池调用的是同一个底层 池，只不过参数不同:
         * fixed 池线程数固定，并且是0秒IDLE（无IDLE）。
         * cache 池线程数支持 0-Integer.MAX_VALUE(显然完全没考虑主机的资源承受能力），60 秒 IDLE
         */
        ExecutorService executorService = Executors.newFixedThreadPool(times);
        runTestRunnable(executorService, times);
    }

    private static void testCachedThreadPool() {
        /**
         * newCachedThreadPool
         * 缓存型池子，先查看池中有没有以前建立的线程，如果有，就 reuse 如果没有，就建一个新的线程加入池中
         * 缓存型池子通常用于执行一些生存期很短的异步型任务 因此在一些面向连接的 daemon 型 SERVER 中用得不多。但对于生存期短的异步任务，它是 Executor 的首选。
         * 能 reuse 的线程，必须是 timeout IDLE 内的池中线程，缺省 timeout 是 60s,超过这个 IDLE 时长，线程实例将被终止及移出池。
         *
         * 注意，放入 CachedThreadPool 的线程不必担心其结束，超过 TIMEOUT 不活动，其会自动被终止。
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
        runTestRunnable(executorService, 5);
    }

    private static void testSingle() {
        /**
         * newSingleThreadExecutor
         * 单例线程，任意时间池中只能有一个线程
         * 用的是和 cache 池和 fixed 池相同的底层池，但线程数目是 1-1,0 秒 IDLE（无 IDLE）
         */
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        runTestRunnable(executorService, 1);
    }
    private static void runTestRunnable(ExecutorService executorService, int times) {
        if (times < 1) {
            return;
        }
        for (int i = 0; i < times ; i++) {
            executorService.execute(new TestRunnable());
            System.out.println("正在执行第" + i + "次");
        }
        executorService.shutdown();
    }
    private static void runTestCallable(ExecutorService executorService, int times, List<Future<String>> futureList) {
        if (times < 1) {
            return;
        }
        for (int i = 0; i < times ; i++) {
            Future<String> future = executorService.submit(new TestCallable(i));
            futureList.add(future);
        }
        executorService.shutdown();
    }
}
