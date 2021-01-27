package com.bartekbak.behavioral.observer;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Subject stockPrice = new Subject();
        IObserver stockMobileApp = new Observer(stockPrice);
        stockPrice.addObserver(stockMobileApp);

        Scanner scanner = new Scanner(System.in);
        double price = 10;
        while (price > 0) {
            System.out.println("Write new price. It will be updated if larger than 10. Insert non positive to exit: \n");
            price = Integer.parseInt(scanner.nextLine());
            if (price > 10) {
                System.out.println("Update!");
                stockPrice.setPrice(price);
            } else if (price > 0) {
                System.out.println("Price too low");
            }
        }
    }
}
