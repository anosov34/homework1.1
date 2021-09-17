package pro.sky.java.course1.lesson6;

public class homework6 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullNameUpperCase);
    }

    private static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameWithZippedPoint = fullName.replace( ' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела – " + fullNameWithZippedPoint);
    }

    private static void task4() {
        String fullName = "Иванов Семён Семёнович";
        String fullNameWithoutE = fullName.replace( 'ё', 'е');
        System.out.println("Данные ФИО сотрудника – " + fullNameWithoutE);
    }

    private static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        int firstIndex = fullName.indexOf (" ");
        int lastIndex = fullName.lastIndexOf(" ");
        String resultLastName = fullName.substring(0,firstIndex);
        String resultFirstName = fullName.substring(firstIndex + 1,lastIndex);
        String resultMiddleName = fullName.substring(lastIndex + 1);
        System.out.println("Имя сотрудника – " + resultFirstName);
        System.out.println("Фамилия сотрудника – " + resultLastName);
        System.out.println("Отчество сотрудника - " + resultMiddleName);

        }

    private static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char [] chars = fullName.toCharArray();
        int firstIndex = 0;
        int secondIndex = fullName.indexOf(" ") + 1;
        int thirdIndex = fullName.lastIndexOf(" ") + 1;
        StringBuilder resultFullName = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
           if (i == firstIndex || i == secondIndex || i == thirdIndex) {
               resultFullName.append(Character.toUpperCase(chars[i]));
           } else {
               resultFullName.append(chars[i]);
           }

        }
        System.out.println(resultFullName);
    }

    private static void task7() {
        String firstNumbers = "135";
        String secondNumbers = "246";
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            numbers.append(firstNumbers.charAt(i));
            numbers.append (secondNumbers.charAt(i));
        }
        System.out.println(numbers);
    }
}


