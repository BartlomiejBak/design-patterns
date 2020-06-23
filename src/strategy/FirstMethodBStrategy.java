package strategy;

public class FirstMethodBStrategy implements IFirstMethodStrategy {
    @Override
    public void printSomething() {
        System.out.println("This is a first method with strategy 'B' ");
    }
}
