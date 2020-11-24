package designmodel.factory.human;

public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends HumanService> T createHuman(Class<T> c) {
        HumanService humanService = null;
        try {
            humanService = (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e) {
            System.out.println("生成失败");
        }
        return (T)humanService;
    }
}
