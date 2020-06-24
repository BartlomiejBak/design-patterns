package abstract_factory;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Choose version (A/B): ");
        IFactory factory;

        Scanner scanner = new Scanner(System.in);
        String version = scanner.next().toUpperCase();
        if (version.equals("A")){
            factory = new FactoryA();
        } else {
            factory = new FactoryB();
        }

        IProductA productA = factory.getProductA();
        IProductB productB = factory.getProductB();

        System.out.println(productA.toString());
        System.out.println(productB.toString());
    }
}
