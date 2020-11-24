package designmodel.factory.human;

public abstract class AbstractHumanFactory {
   public abstract <T extends HumanService> T createHuman(Class<T> c);
}
