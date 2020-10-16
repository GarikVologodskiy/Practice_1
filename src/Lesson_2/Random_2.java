package Lesson_2;

import java.util.Scanner;

public class Random_2 {
    public static void main(String[] args) {
        int random_num = (int) (Math.random()*100-1) + 1;
        System.out.println("random_num = " + random_num);
        System.out.println("Please enter the number: ");
        Scanner in = new Scanner(System.in);
        int manual_num = in.nextInt();

        while (manual_num != random_num) {
            if (manual_num < random_num) {
                System.out.println("Your number is too low. Try again: ");
                manual_num = in.nextInt();
            }
            if (manual_num > random_num) {
                System.out.println("Your number is too high. Try again: ");
                manual_num = in.nextInt();
            }
            if (manual_num == random_num) {
                System.out.println("You win!");
                break;
            }
            if (manual_num == 0) {
                System.out.println("Bye!");
                break;
            }
        }
    }
}
