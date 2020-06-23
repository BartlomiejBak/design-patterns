package strategy;

public class FirstMethodAStrategy implements IFirstMethodStrategy {
    @Override
    public void printSomething() {
        System.out.println("This is a first method with strategy 'A' ");
    }
}
