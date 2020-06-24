package decorator;

public class ConcreteComponent extends Component {
    int baseValue = 10;

    @Override
    int getSum() {
        return this.baseValue;
    }

    @Override
    int getProduct() {
        return this.baseValue;
    }
}
