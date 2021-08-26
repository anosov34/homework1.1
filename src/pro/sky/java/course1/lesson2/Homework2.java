package pro.sky.java.course1.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task5() {
        int percent = 10;
        float rise = percent / 100f;
        System.out.println(rise);

        int mashaSalary = 67760;
        double mashaIncreasedSalary = mashaSalary * rise;
        double mashaPostPromotionIncome = mashaSalary + mashaIncreasedSalary;
        System.out.println(mashaPostPromotionIncome);

        int denialSalary = 83690;
        double denialIncreasedSalary = denialSalary * rise;
        double denialPostPromotionIncome = denialSalary + denialIncreasedSalary;
        System.out.println(denialPostPromotionIncome);

        int kristinaSalary = 76230;
        double kristinaIncreasedSalary = kristinaSalary * rise;
        double kristinaPostPromotionIncome = kristinaSalary + kristinaIncreasedSalary;
        System.out.println(kristinaPostPromotionIncome);

        double yearDifferenceMasha = (mashaPostPromotionIncome - mashaSalary) * 12 ;
        System.out.println( "Маша теперь будет получать " + mashaPostPromotionIncome + ". Годовой доход вырос на " + yearDifferenceMasha);

        double yearDifferenceDenis = (denialPostPromotionIncome - denialSalary) * 12 ;
        System.out.println("Денис теперь будет получать " + denialPostPromotionIncome + ". Годовой доход вырос на " + yearDifferenceDenis);

        double yearDifferenceKristina = (kristinaPostPromotionIncome - kristinaSalary) * 12 ;
        System.out.println("Кристина теперь будет получать " + kristinaPostPromotionIncome + ". Годовой доход вырос на " + yearDifferenceKristina);
    }

    private static void task4() {
        int weightToGoalInKg = 7;
        int weightToGoalInGr = weightToGoalInKg * 1000 ;
        int lostWeightInOneDay250 = 250 ;
        int resultInDays250 = weightToGoalInGr / lostWeightInOneDay250 ;
        System.out.println("Требуется " +  resultInDays250 + " дней, чтобы сбросить 7 кг.");


        int lostWeightInOneDay500 = 500 ;
        int resultInDay500 = weightToGoalInGr /  lostWeightInOneDay500 ;
        System.out.println("Требуется " +  resultInDay500 + " дней, чтобы сбросить 7 кг.");
    }

    private static void task3() {
        int bananasWeightGr = 80 ;
        int milkWeightGr = 105 ;
        int iceCreamGr = 100 ;
        int eggsGr = 70 ;


        int bananasForBreakfast = bananasWeightGr * 5 ;
        int milkForBreakfast = milkWeightGr * 2;
        int iceCreamForBreakfast = iceCreamGr * 2 ;
        int eggsForBreakfast = eggsGr * 4;
        int breakfastWeightGr = bananasForBreakfast + milkForBreakfast + iceCreamForBreakfast + eggsForBreakfast ;
        System.out.println("Вес завтрака " + breakfastWeightGr + " грамм");


        float breakfastWeightInKg = breakfastWeightGr / 1000f ;
        System.out.println("Вес завтрака " + breakfastWeightInKg + " кг");
    }

    private static void task2() {
        double klichko = 78.2 ;
        double anosov = 82.7;
        double weight = klichko + anosov;
        System.out.println( "Общий вес боксёров " + weight + " кг");

        double differenceWeight = anosov - klichko;
        System.out.println("Разница в весе " + differenceWeight + " кг");
    }

    private static void task1() {
        byte a = 1;
        short b = 30_000;
        int c = 30_000_000;
        long d = 1000_000_000_000L;
        System.out.println(d);

        float a1 = 0.34345f;
        double b1 = 304.34564323432432534534;

        char lattice = 35;
        System.out.println(lattice);
    }
}
