package com.bartekbak.creational.factory_method;

public class BalancedFactory implements IFactory {
    int quantityOfProductOne = 0;
    int quantityOfProductTwo = 0;
    int quantityOfProductN = 0;

    @Override
    public Product factoryMethod() {
        if (isMinimumFromThree(quantityOfProductOne, quantityOfProductTwo, quantityOfProductN)) {
            this.quantityOfProductOne++;
            return new ProductOne();

        } else if (isMinimumFromThree(quantityOfProductTwo, quantityOfProductOne, quantityOfProductN)) {
            this.quantityOfProductTwo++;
            return new ProductTwo();
        } else {
            this.quantityOfProductN++;
            return new ProductN();
        }
    }

    public boolean isMinimumFromThree (int chosenNumber, int secondNumber, int thirdNumber) {
        return chosenNumber <= secondNumber && chosenNumber <= thirdNumber;
    }

}
