package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Homework5Massive {
    public static void main(String[] args) {
        int[] task1 = generateRandomArray();
        int[] task2 = generateRandomArray2();
        int[] task3 = generateRandomArray3();
        task4();
        task5();
    }
    // task1
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            arr[index] = random.nextInt(100_000) + 100_000;
            sum = sum + arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        return arr;
    }
// task2
    public static int[] generateRandomArray2() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int  maxArr = -1;
        int minArr = 201_000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            if (arr[i] < minArr) {
                minArr = arr [i];
            }
        }
        for (int index = 0; index < arr.length; index++) {
            arr[index] = random.nextInt(100_000) + 100_000;
            if (arr[index] > maxArr) {
                maxArr = arr [index];
            }
        }
        System.out.println( "Максимальная сумма трат за месяц составила " +  maxArr +  " рублей. Минимальная сумма трат за месяц составила " + minArr + " рублей.");
            return arr;
    }
//    task3
    public static int[] generateRandomArray3() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum = sum + arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " +  sum / arr.length + " рублей");
        return arr;
//        Знаю, что в этой задаче нужно было сделать с дробными, но не смог понять как=(
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

