package Lesson_2;

public class Array {
    public static void main(String[] args) {
        int[] num = {1,8,9,10,11};
        num[1] = num[3];
        int length = num.length;
        System.out.println(length);
        for (int i = 0; i < num.length; i++) {
            System.out.println("idx=" + i +";"+" value=" + num[i] +";");
        }
    }
}
