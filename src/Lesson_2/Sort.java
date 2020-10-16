package Lesson_2;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        int temp;
        int arr[];
        arr = new int [25];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 12);
        }
        System.out.println("Original array: ");
        initprint(arr);
        bubblesort(arr);
        initprint(arr);
        autosort(arr);
        initprint(arr);
    }

    // Output original array
    public static void initprint(int[] init) {
        for (int i = 0; i < init.length; i++) {
            System.out.print(init[i] + "; ");
        }
        System.out.println();
        System.out.println("----------------");
    }

    // Output bubble sorted array
    public static void bubblesort(int[] bsort) {
        System.out.println("Bubble sorted array: ");
        for (int j = 0; j < bsort.length; j++) {
            for (int n = 0; n < bsort.length; n++) {
                if (bsort[j] >= bsort[n]) {
                    int temp = bsort[j];
                    bsort[j] = bsort[n];
                    bsort[n] = temp;
                }
                /*System.out.print(bsort[n] + "; ");*/
            }
        }
    }

    // Output auto sorted array
    public static void autosort(int[] asort) {
        System.out.println("Auto sorted array: ");
        Arrays.sort(new int[][]{asort}, Collections.reverseOrder());
        for (int i = 0; i < asort.length; i++) {
            /*System.out.print(asort[i] + "; ");*/
        }
    }
}