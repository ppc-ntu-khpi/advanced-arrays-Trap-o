package test;

import java.util.Scanner;
import domain.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Знаходження суми елементів матриці.\n");

        System.out.print("Введіть кількість рядків матриці: ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців матриці: ");
        int columns = scanner.nextInt();

        System.out.println("\nСума всіх елементів матриці = " + Solution.calculateSumOfElements(rows, columns));
        
    }
}