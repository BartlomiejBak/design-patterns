package com.bartekbak.creational.factory_method;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("We will create some random type of Products");
        System.out.println("Put the number of elements: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        IFactory randomFactory = new RandomFactory();
        IFactory balancedFactory = new BalancedFactory();


        Product[] randomListOfProducts = new Product[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            randomListOfProducts[i] = randomFactory.factoryMethod();
        }

        Product[] balancedListOfProducts = new Product[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            balancedListOfProducts[i] = balancedFactory.factoryMethod();
        }

        System.out.println("Random list: ");
        for (Product randomListOfProduct : randomListOfProducts) {
            System.out.println(randomListOfProduct.toString());
        }

        System.out.println("Balanced list: ");
        for (Product balancedListOfProduct : balancedListOfProducts) {
            System.out.println(balancedListOfProduct.toString());
        }
    }
}
