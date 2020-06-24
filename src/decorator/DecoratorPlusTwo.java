package decorator;

public class DecoratorPlusTwo extends Decorator{

    int value = 2;

    public DecoratorPlusTwo(Component component) {
        super(component);
    }

    @Override
    int getSum() {
        return component.getSum() + value;
    }

    @Override
    int getProduct() {
        return component.getProduct() * value;
    }
}
