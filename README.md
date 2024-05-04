# Практична робота "Поглиблене використання масивів" <br>Яценко Віталій
### На дану практичну роботу мною було взято завдання №5: Обчислити суму елементів матриці розміром N x M.

У моїй роботі у класі ````Main```` користувач за запитом вводить числа-кількість рядків та стовпців. Далі викликається метод ````calculateSumOfElements```` з класу ````Solution````. 
У цьому методі викликається інший метод – ````fillMatrix```` – який створює матрицю заданим розміром (кількість рядків і стовпців, які ввів користувач), заповнену випадковими числами від 1 до 10. 
Повертаючись до методу ````calculateSumOfElements````, в ньому обчислюється сума всіх чисел, записаних у матриці.

**Реалізація рішення:**
```java
public class Solution {

    public static int calculateSumOfElements(int rows, int columns) {
        int[][] matrix = Solution.fillMatrix(rows, columns);

        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }

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
```
**В результаті виконання програми до консолі виводиться згенерована матриця та сума її елементів:**

<img align="center" width="50%" height="50%" src=image.png>
