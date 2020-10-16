package Lesson_2;

public class Array2x {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 50;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[1][0] = 40;
        matrix[1][1] = 10;
        matrix[1][2] = 25;
        matrix[2][0] = 60;
        matrix[2][1] = 70;
        matrix[2][2] = 90;
        /*for (int i = 0; i < matrix.length; i++) {
            System.out.println("печатаем " + i + " строку матрицы");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/
        func(matrix);
    }

    public static void func(int[]... mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println("печатаем " + i + " строку матрицы");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
