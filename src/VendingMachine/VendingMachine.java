package VendingMachine;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

public class VendingMachine {

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

    public static void getMenu() {
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
    }

    public static void inputDrink() {
        int maxDrink = Drinks.values().length;
        int drink = 0;
        boolean drinkFound = false;

        do {
            System.out.println("Choose your drink: ");
            Scanner insert = new Scanner(System.in);

            try {
                drink = insert.nextInt();
                if (drink > 0 && drink < maxDrink) {
                    System.out.println("Number of your drink is: " + drink);
                    drinkFound = true;
                } else {
                    System.out.println("Sorry, " + drink + " number " + "doesn't exist!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong! Try it again");
                insert.nextInt();
            }
        } while (!drinkFound);
    }

    public static void inputCoin() {

        double input = 0;
        do {
            System.out.println("Insert coins here -> ");
            Scanner insert = new Scanner(System.in);

            try {
                input = insert.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Wrong! Try it again");
                insert.nextDouble();
            }
        } while (input == 0);
            double coin = Coins.values().length-1;
            double change = input - coin;
            double coinRemains = 0 - change;

            if (coinRemains > 0) {
                System.out.println("Please insert else " + coinRemains);
            }
    }
}

            /*
        public static void inputCoin() {

            double coin = 0;
            double sum = 0;

            Scanner ins = new Scanner(System.in);
            System.out.println();
            System.out.println("Insert coins here -> ");
            coin = ins.nextDouble();

            System.out.println("Your balance: " + sum);
        }

        public static void inputDrink() {

            System.out.println("Choose your drink: ");
            Scanner inp = new Scanner(System.in);
            int input = inp.nextInt();

           if (input == 1) {
                System.out.println("Your choice is: " + ABSENT.getName() + " for " + "$" + ABSENT.getPrice() + ";");
            }

            else if (input == 2) {
                System.out.println("Your choice is: " + COCA.getName() + " for " + "$" + COCA.getPrice() + ";");
            }

            else if (input == 3) {
                System.out.println("Your choice is: " + COFFEE.getName() + " for " + "$" + COFFEE.getPrice() + ";");
            }

            else if (input == 4) {
                System.out.println("Your choice is: " + MILK.getName() + " for " + "$" + MILK.getPrice() + ";");
            }

            else if (input == 5) {
                System.out.println("Your choice is: " + SODA.getName() + " for " + "$" + SODA.getPrice() + ";");
            }

            else if (input == 6) {
                System.out.println("Your choice is: " + SPRITE.getName() + " for " + "$" + SPRITE.getPrice() + ";");
            }

            else if (input == 7) {
                System.out.println("Your choice is: " + TEA.getName() + " for " + "$" + TEA.getPrice() + ";");
            }

            else {
                System.out.println("You entered an invalid number!");
                System.out.println("Please, try it again: ");
                inputDrink();
            }
            */