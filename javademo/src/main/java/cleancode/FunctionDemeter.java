package cleancode;

// 德墨忒尔律: 模块不应该了解它所操作对象的内部情况
// 方法不应该调用由任何函数返回的对象方法
public class FunctionDemeter {
    public static void main(String[] args) {
        // 避免出现 a.getB().getC()
        // 可以使用改为公共变量 a.b.c
    }

}
