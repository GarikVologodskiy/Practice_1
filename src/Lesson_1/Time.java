package Lesson_1;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of seconds: ");
        double sec = in.nextDouble();
        double hours = sec/3600;
        System.out.println("The number of hours is: " + hours);
        in.close();
    }
}
