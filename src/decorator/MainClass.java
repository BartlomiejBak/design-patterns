package decorator;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("We will add and multiply some numbers: 10, 2, 5 and 5");
        Component twoTwoFiveFive = new DecoratorPlusFive(new DecoratorPlusFive(new DecoratorPlusTwo(new ConcreteComponent())));
        System.out.println("the sum is " + twoTwoFiveFive.getSum());
        System.out.println("the product is " + twoTwoFiveFive.getProduct());
    }
}
