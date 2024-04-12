package Week7;

import java.util.Arrays;

public class MatrixTester {
    public static void main(String[] args) {
        double[][] values1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        double[][] values2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        Matrix mat1 = new Matrix(values1);
        Matrix mat2 = new Matrix(values2);

        System.out.println("matrix1: ");
        System.out.println(mat1);

        System.out.println("matrix2: ");
        System.out.println(mat2);

        System.out.println("matrix1 + matrix2: ");
        System.out.println(mat1.add(mat2));

        System.out.println("matrix1 - matrix2: ");
        System.out.println(mat1.substract(mat2));

        System.out.println("matrix1 * matrix2: ");
        System.out.println(mat1.multiplicate(mat2));

        System.out.println(mat2.turnMat());
        System.out.println(Arrays.toString(mat1.getrow(2)));

    }
}