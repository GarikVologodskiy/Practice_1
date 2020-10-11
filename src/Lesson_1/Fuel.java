package Lesson_1;

import java.util.Scanner;

public class Fuel {
    public static void main(String[] args){

        double price = 47.5;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of liters: ");
        int lit = in.nextInt();
        double cost = price * lit;
        System.out.println("Your fuel cost is: " + cost + " RUB");
        in.close();
    }
}