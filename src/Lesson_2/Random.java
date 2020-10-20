package Lesson_2;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        System.out.println("For exit enter the \"0\"" + "\n");
        int random_num = (int) (Math.random()*100-1) + 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Random number is: " + random_num + "");
        System.out.println("Please enter the number: ");
        int manual_num = in.nextInt();
        int prev = 0, cur = 0;

        while (random_num != manual_num) {
            prev = Math.abs(random_num - prev); /* 50 */
            cur = Math.abs(prev - manual_num); /* 10 */
            if (prev < cur) {
                System.out.println("Hot!");
                manual_num = in.nextInt();
                }
            else if (prev > cur) {
                System.out.println("Cold!");
                manual_num = in.nextInt();
                }
            if (random_num == manual_num) {
                System.out.println("Matches! Our congrats!");
                break;
            }
            else if (manual_num == 0) {
                System.out.println("Bye!");
                break;
            }
            int temp = cur;
            prev = temp;
        }
        in.close();
    }
}