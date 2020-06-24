package decorator;

public class DecoratorPlusFive extends Decorator {

    int value = 5;

    public DecoratorPlusFive(Component component) {
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
