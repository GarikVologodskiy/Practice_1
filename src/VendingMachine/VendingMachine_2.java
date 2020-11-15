package VendingMachine;
import java.util.InputMismatchException;
import java.util.Scanner;

import static VendingMachine.VendingMachine_2.Drinks.*;

public class VendingMachine_2 {
    enum Drinks {
        ABSENT("Absinthe", 6.20), COCA("Coca-Cola", 0.40), COFFEE("Coffee", 1.20), MILK("Milk", 0.90), SODA("Soda", 0.10), SPRITE("Sprite", 0.50), TEA("Tea", 0.35);
        private String name;
        private double price;

        Drinks(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public String toString() {
            return String.valueOf(price);
        }
    }
    enum Coins {
        COIN1(0.1), COIN2(0.2), COIN3(0.4), COIN4(0.5), COIN5(1);
        private double value;
        private static Coins coins;

        Coins(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }
    }

    public static int getMenu() {
        int i = 1;

        System.out.println("!!!DRINKS!!!");
        System.out.println("------------------------------------");

        for (Drinks drinks : Drinks.values()) {
            System.out.println(i + ". " + drinks.getName() + "; " + "price:" + "$" + drinks.getPrice() + ";");
            i += 1;
        }

        System.out.println();
        System.out.println("Available coins only: ");
        for (Coins coins : Coins.values()) {
            System.out.print("$" + coins.getValue() + "; ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Make your choice: ");
        Scanner insert = new Scanner(System.in);
        try {
            int input = insert.nextInt();
            return input;
        } catch (InputMismatchException e) {
            System.out.println("Wrong! Try it again");
            insert.nextInt();
        }
        return i;
    }

    public static double Price (double item) {
        if (item == 1) {
            return ABSENT.getPrice();
        }
        if (item == 2) {
            return COCA.getPrice();
        }
        if (item == 3) {
            return COFFEE.getPrice();
        }
        if (item == 4) {
            return MILK.getPrice();
        }
        if (item == 5) {
            return SODA.getPrice();
        }
        if (item == 6) {
            return SPRITE.getPrice();
        }
        if (item == 7) {
            return TEA.getPrice();
        }
        return item;
    }

    public static double Money (double cost) {
        double coin = 0;
        Scanner insert = new Scanner(System.in);
        System.out.println("Please insert " + "$" + cost + " here ->");

        try {
            coin = insert.nextDouble();

            while (coin < cost) {
                System.out.println("Still need: " + (cost - coin));
                coin = coin + insert.nextDouble();
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong! Try it again");
            insert.nextDouble();
        }
        System.out.println("Thank you! Bye!");
        return coin - cost;
    }
}