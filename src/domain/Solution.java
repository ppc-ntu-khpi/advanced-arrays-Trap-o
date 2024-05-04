package domain;

import java.util.Arrays;
import java.util.Random;

/** Клас для визначення суми елементів двомірного масиву
 * Генерує матрицю відповідно до переданих значень кількості рядків та стовпців, додає значення всіх елементів масиву
 */
public class Solution {

    /** Метод для обрахунку суми елементів довільної 2D матриці
     * @param rows – кількість рядків матриці
     * @param columns – кількість стовпців матриці
     * @return суму елементів матриці
     */
    public static int calculateSumOfElements(int rows, int columns) {
        int[][] matrix = Solution.fillMatrix(rows, columns);

        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }

    /** Метод для створення і виведення на екран 2D матриці, яка заповнена випадковими значеннями (1-10)
     * @param rows – кількість рядків матриці
     * @param columns – кількість стовпців матриці
     * @return 2D матрицю, заповнену випадковими значеннями
     */
    private static int[][] fillMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];

        Arrays.setAll(matrix, i -> {
            int[] row = new int[matrix[i].length];
            Arrays.setAll(row, j -> random.nextInt(10) + 1);
            return row;
        });

        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));

        return matrix;
    }
}