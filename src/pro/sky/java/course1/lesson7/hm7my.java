package pro.sky.java.course1.lesson7;

public class hm7my {
    public static void main(String[] args) {
        // Task1
        int year = 2020;
        calculateYear(year);

        // Task2
        int yearOfDevice = 2020;
        int OsOfDevice = 1;
        defineVersion(OsOfDevice, yearOfDevice);

        // Task3
        int days = 60;
        int distance = calculateDistance(days);
        System.out.println(distance);

        // Task4
        String doubles = "abccdefghijk";
        checkDoubles(doubles);

        // Task5
        int arr[] = {5, 4, 3, 2, 1};
        reverse(arr);

    }
    // Task1
    public static void calculateYear(int year) {
        if (year % 100 == 0 && year % 400 != 0 || year % 4 != 0) {
            System.out.println(year + " - не високосный год");
        } else {
            System.out.println(year + " - високосный год");
        }
    }

    // Task2
    public static void defineVersion(int clientOS, int clientDeviseYear) {
        if (clientOS == 1) {
            if (clientDeviseYear <= 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviseYear <= 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    // Task3
    public static int calculateDistance(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance >= 20) {
            day++;
        }
        if (deliveryDistance >= 60) {
            day++;
        }
        return day;
    }

    // Task4
    public static void checkDoubles(String doubles) {
        char[] chars = doubles.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                System.out.println("Дубль найден - " + chars[i]);
                return;
            }
        }
        System.out.println("Дубль не найден.");
    }

    // Task5
    public static void reverse(int[] arrayToReverse) {
        for (int i = 0, j = arrayToReverse.length - 1; i < j; i++, j--) {
            int temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[j];
            arrayToReverse[j] = temp;
        }
    }
}

