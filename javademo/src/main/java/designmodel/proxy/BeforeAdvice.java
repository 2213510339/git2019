package designmodel.proxy;

public class BeforeAdvice implements Advice {
    @Override
    public void execute() {
        System.out.println(" beforeAdvice done");
    }
}
