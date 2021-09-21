package pro.sky.java.course1.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Homework5Massive {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        int[] expenses = generateRandomArray();
        int sum = 0;
        for (int daily : expenses) {
            sum += daily;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task2() {
        int[] expenses = generateRandomArray();
        int maxArr = 0;
        int minArr = expenses[0];
        for (int expense : expenses) {
            if (maxArr < expense) {
                maxArr = expense;
            }
            if (expense < minArr) {
                minArr = expense;
            }
        }
        System.out.println("Максимальная сумма трат за месяц составила " + maxArr + " рублей. Минимальная сумма трат за месяц составила " + minArr + " рублей.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
      }
        double summary = sum;
        double averageExpenses = summary / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " +  averageExpenses + " рублей");
    }

    private static void task4() {
        char[] reverseFullName = { 'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    private static void task5() {
        int [][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i] [matrix.length - i - 1] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int b = 0; b < matrix[0].length; b++) {
                System.out.print(matrix[i][i] + " ");
            }
            System.out.println();
        }
    }
}

