package Lesson_2;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        System.out.println("For exit enter the \"0\"" + "\n");
        int random_num = (int) (Math.random() * 100 - 1) + 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Random number is: " + random_num + "");
        System.out.println("Please enter the number: ");
        int manual_num = in.nextInt();
        int prev = 0;

        do {
            if (random_num == manual_num) {
                System.out.println("Matches! Our congrats!");
                break;
            } else {
                int absRandomPrev = Math.abs(random_num - prev); /*Random = 45, prev = 0*/
                int absRandomCur = Math.abs(random_num - manual_num); /*man = 35; 10*/

                if (absRandomPrev < absRandomCur) {
                    System.out.println("Cold!");
                } else {
                    System.out.println("Hot!");
                }
                prev = manual_num;
                manual_num = in.nextInt();
            }
        } while(random_num != manual_num);
        System.out.println("Matches! Our congrats!");
        in.close();
    }
}