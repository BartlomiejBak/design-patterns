package adapter;

public class MainClass {
    public static void main(String[] args) {
        ITarget target = new Adapter(new Adaptee());
        
        target.request();
    }
}
