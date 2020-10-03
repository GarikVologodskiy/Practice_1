package Lesson_2;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        System.out.println("For exit enter the \"0\"" + "\n");
        int random_num = (int) (Math.random()*100-1) + 1;
        System.out.println("Random number is: " + random_num + "");
        Scanner in = new Scanner(System.in);
        int manual_num = 0;
        int dif = 0;

        while(random_num != manual_num) {
            System.out.println("Please enter the number: ");
            manual_num = in.nextInt();
            System.out.println("Your number is: " + manual_num);

            if (manual_num != 0) {
               dif =  Math.abs(random_num - manual_num);
            }
            else if (manual_num == 0) {
                System.out.println("Bye!");
                break;
            }
            if (dif > 10) {
                System.out.println("It's cold");
            }
            else if (dif > 0) {
                System.out.println("It's hot");
            }
            else if (random_num == manual_num) {
                System.out.println("Matches! Our congrats!");
                break;
            }
        }
    }
}