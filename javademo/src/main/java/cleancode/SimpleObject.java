package cleancode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleObject implements Subject{
    List<Observer> observers;
    public  SimpleObject() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObsercer(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()) {
            Observer  observer = (Observer) iterator.next();
            observer.update();
        }
    }
}
