package VendingMachine;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class VendingMachine_2 {
    enum Drinks {
        ABSENT(1, "Absinthe", 6.20),
        COCA(2, "Coca-Cola", 0.40),
        COFFEE(3, "Coffee", 1.20),
        MILK(4, "Milk", 0.90),
        SODA(5, "Soda", 0.10),
        SPRITE(6, "Sprite", 0.50),
        TEA(7, "Tea", 0.35);

        private String name;
        private double price;
        private int idx;

        Drinks(int idx) {
            this.idx = idx;
        }

        public int getIdx() {
            return idx;
        }

        public void setIdx(int idx) {
            this.idx = idx;
        }

        Drinks(int idx, String name, double price) {
            this.name = name;
            this.price = price;
            this.idx = idx;
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

    public static int getMenu() throws MyException {
        int i = 1;
        int ItemMax = Drinks.values().length;

        System.out.println("!!!DRINKS!!!");
        System.out.println("------------------------------------");

        for (Drinks drinks : Drinks.values()) {
            System.out.println(i + ". " + drinks.getName() + "; " + "price:" + "$" + drinks.getPrice() + ";");
            i += 1;
        }

        System.out.println("\nAvailable coins only: ");
        for (Coins coins : Coins.values()) {
            System.out.print("$" + coins.getValue() + "; ");
        }

        System.out.println("\n\nMake your choice: ");
        Scanner insert = new Scanner(System.in);
        int input;

        do {
            while (!insert.hasNextInt()) {
                System.out.println("It's not a number!");
                System.out.println("Make your choice again: ");
                insert.next();
            }
            input = insert.nextInt();
        } while (input <= 0);

        if (input > ItemMax) {
            throw new MyException("Wrong number!");
        }
        return input;
    }

    /*В цикле перебираем значения enum
    * Сравниваем значение на входе со значением индекса enum
    * Если равенство - возвращаем цену*/
    public static double getPriceByIndex (int item) {
        for (Drinks drinks : Drinks.values()) {
            if (drinks.getIdx() == item) {
                return drinks.getPrice();
            }
        }
        return -1;
    }

    public static double Money (double cost) {
        double coin;
        Scanner insert = new Scanner(System.in);
        System.out.println("Please insert " + "$" + cost + " here ->");

        do {
            while (!insert.hasNextDouble()) {
                System.out.println("This is an unresolved coin!");
                System.out.println("Try it again: ");
                insert.next();
            }
            coin = insert.nextDouble();
        } while (coin <= 0);

        while (coin < cost) {
            System.out.println("Still need: " + (cost - coin));
            coin = coin + insert.nextDouble();
        }
        System.out.println("Thank you! Bye!");
        return coin - cost;
    }

    public static class MyException extends Throwable {
        public MyException() {
        }

        public MyException(String s) {
        }
    }
}