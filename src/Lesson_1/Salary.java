package Lesson_1;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        double rate = 0.13;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the gross salary: ");
        double gross = in.nextDouble();
        double tax = gross * rate;
        double net = gross - tax;
        System.out.println("Your net salary is: " + net + " RUB");
        in.close();
    }
}
