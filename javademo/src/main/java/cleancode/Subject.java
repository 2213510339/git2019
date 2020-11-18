package cleancode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 被观察者
public interface Subject {
    void registerObsercer(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
