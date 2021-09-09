package pro.sky.java.course1.lesson4;

public class homework4 {
    public static void main(String[] args) {


        task1();
        task2();
        task3();
    }

    private static void task1() {
        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number++;

        }
        System.out.println();
        for (int forNumber = 10; forNumber > 0; forNumber--) {
            System.out.print(forNumber + " ");

        }
    }
    private static void task2() {
        for (int dayNumber = 7; dayNumber <= 31; dayNumber++) {

            if (dayNumber % 7 == 0) {
                System.out.println();
                System.out.println("Сегодня пятница " + dayNumber + " число. Необходимо отправить отчёт");


            }

        }
    }
    private static void task3() {
        int currentYear = 2021;
        int minYear = currentYear - 200;
        int maxYear = currentYear + 79;
        for (int year = minYear; year <= maxYear; year ++) {
        if (year % 79 == 0) {
            System.out.println(year);
        }
        }
    }





}




