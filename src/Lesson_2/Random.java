package Lesson_2;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        System.out.println("For exit enter the \"0\"" + "\n");
        int random_num = (int) (Math.random()*100-1) + 1;
        /* print for checking */
        Scanner in = new Scanner(System.in);
        System.out.println("Random number is: " + random_num + "");
        int manual_num = 0, prev = 0, cur = 0, next = 0, dif =0;

        while (random_num != manual_num | manual_num !=0) {
            System.out.println("Please enter the number: ");
            manual_num = in.nextInt();
            System.out.println("Your number is: " + manual_num);

            cur = Math.abs(random_num - prev); /* 50 */
            next = Math.abs(cur - manual_num); /* 10 */

            if (cur < next) {
                System.out.println("Hot!");
                }
            else if (cur > next) {
                System.out.println("Cold!");
                }
            if (random_num == manual_num) {
                System.out.println("Matches! Our congrats!");
                break;
            }
            else if (manual_num == 0) {
                System.out.println("Bye!");
                break;
            }
            prev = manual_num;
        }
        in.close();
    }
}