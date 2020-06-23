package observer;

public class Observer implements IObserver {
    Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("the new stock price is: " + this.subject.getPrice());
    }
}
