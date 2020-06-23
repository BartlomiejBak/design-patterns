package strategy;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Client objectAA = new Client(new FirstMethodAStrategy(), new SecondMethodAStrategy());
        Client objectBB = new Client(new FirstMethodBStrategy(), new SecondMethodBStrategy());
        Client objectAB = new Client(new FirstMethodAStrategy(), new SecondMethodBStrategy());

        List<Client> objectList = new ArrayList<>();
        objectList.add(objectAA);
        objectList.add(objectAB);
        objectList.add(objectBB);

        for (Client object : objectList) {
            object.doSomething();
            object.printSomething();
            System.out.println();
        }
    }
}
