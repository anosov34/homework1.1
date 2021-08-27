package pro.sky.java.course1.lesson3;

public class homework3 {
    public static void main(String[] args) {

        task1();
        task2();
        task4();
        task5();
        task6();
    }

    private static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    private static void task2() {
        int clientOS = 1;
        int clientDeviseYear = 2015;
        if (clientOS == 1) {
            if (clientDeviseYear < 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviseYear < 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    private static void task4() {
        int deliveryDistance = 30;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займёт сутки");
        } else if (deliveryDistance >= 60) {
            System.out.println("Доставка займёт трое суток");
        } else {
            System.out.println("Доставка займёт двое суток");
        }
    }

    private static void task5() {
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
            default:
                System.out.println("Человечество не придумало месяц на эту цифру=(");
        }
    }

    private static void task6() {
        int age = 20;
        int salary = 20_000;

        int ifYouYoung = salary * 2;
        int ifYouOld = salary * 3;

        double ifYourYoungAndSalaryMoreThen50 = ifYouYoung * 1.2;
        double ifYourYoungAndSalaryMoreThen80 = ifYouYoung * 1.5;

        double ifYourOldAndSalaryMoreThen50 = ifYouOld * 1.2;
        double ifYourOldAndSalaryMoreThen80 = ifYouOld * 1.5;

        if (age >= 23) {
            if (salary > 80_000) {
                System.out.println("Ты взрослый и отлично зарабатываешь. Мы дадим тебе карту с кредитным лимитом на " + ifYourOldAndSalaryMoreThen80);
            } else if (salary > 50_000) {
                System.out.println("Ты взрослый и хорошо зарабатываешь. Мы дадим тебе карту с кредитным лимитом на " + ifYourOldAndSalaryMoreThen50);
            } else {
                System.out.println("Ты просто взрослый. Мы дадим тебе карту с кредитным лимитом на " + ifYouOld);
            }
        }
        if (age < 23) {
            if (salary > 80_000) {
                System.out.println("Ты молодой и отлично зарабатываешь. Мы дадим тебе карту с кредитным лимитом на " + ifYourYoungAndSalaryMoreThen80);
            } else if (salary > 50_000) {
                System.out.println("Ты молодой и хорошо зарабатываешь. Мы дадим тебе карту с кредитным лимитом на " + ifYourYoungAndSalaryMoreThen50);
            } else {
                System.out.println("Ты просто молод. Мы дадим тебе карту с кредитным лимитом на " + ifYouYoung);
            }
        }
    }
}




















