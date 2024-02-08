package OOP_sem1_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b = new BottleOfWatter("test", 1, 1);
        System.out.println(b);
        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);

        HotDrink a1 = new HotDrink("tea", 100, 30, 60);
        HotDrink a2 = new HotDrink("coffee", 140, 30, 65);

        HotDrinkVendingMachine vendingMachine2 = new HotDrinkVendingMachine(new ArrayList<>());
        vendingMachine2.addHodDrink(a1);
        vendingMachine2.addHodDrink(a2);
        BottleOfWatterVendingMachine vendingMachine = new BottleOfWatterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWatter(b1);
        vendingMachine.addBottleOfWatter(b2);
        vendingMachine.addBottleOfWatter(b3);
        vendingMachine.addBottleOfWatter(b4);
        vendingMachine.addBottleOfWatter(b5);
        System.out.println(vendingMachine.getProduct("20", 5));
        System.out.println(vendingMachine.getProduct("20", 100));
        System.out.println(vendingMachine2.getProduct("tea", 30, 60));
        System.out.println(vendingMachine2.getProduct("tea", 30, 70));
//        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
//            System.out.println(b);
//        }

    }
}
