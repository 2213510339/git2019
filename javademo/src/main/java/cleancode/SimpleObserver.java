package cleancode;

public class SimpleObserver implements Observer {
    Subject subject;
    public SimpleObserver(Subject subject) {
        this.subject=subject;
    }
    @Override
    public void update() {

    }
}
