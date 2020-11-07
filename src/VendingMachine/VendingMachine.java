package VendingMachine;

import java.util.Scanner;

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

        public static void getMenu() {
            int i = 1;
            System.out.println("DRINKS");
            System.out.println("------------------------------------");
            for (Drinks drinks : Drinks.values()) {
                System.out.println("number:" + i + "; " + "drink:" + drinks.getName() + "; " + "price:" + "$" + drinks.getPrice() + ";");
                i += 1;
            }
            System.out.println();
            System.out.println("Please, enter the number of the drink: ");
        }

        public static void inputDrink() {

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
        }
    }
}