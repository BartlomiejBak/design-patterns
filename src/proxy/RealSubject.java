package proxy;

public class RealSubject implements ISubject {
    @Override
    public String request() {
        return "method of expensive class, that is created only if needed";
    }
}
