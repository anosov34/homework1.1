package pro.sky.java.course1.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    private static void Task5() {
        int m = 67760;
        double m10 = m * 0.1;
        double m_resume = m + m10;
        System.out.println(m_resume);

        int d = 83690;
        double d10 = d * 0.1;
        double d_resume = d + d10;
        System.out.println(d_resume);

        int k = 76230;
        double k10 = k * 0.1;
        double k_resume = k + k10;
        System.out.println(k_resume);

        double yearDifferenceMasha = (m_resume * 12) - (m * 12) ;
        System.out.println( "Маша теперь будет получать " + m_resume + ". Годовой доход вырос на " + yearDifferenceMasha);

        double yearDifferenceDenis = (d_resume * 12) - (d * 12) ;
        System.out.println("Денис теперь будет получать " + d_resume + ". Годовой доход вырос на " + yearDifferenceDenis);

        double yearDifferenceKristina = (k_resume * 12) - (k * 12) ;
        System.out.println("Кристина теперь будет получать " + k_resume + ". Годовой доход вырос на " + yearDifferenceKristina);
    }

    private static void Task4() {
        int WeightToGoalInKg = 7;
        int WeightToGoalInGr = WeightToGoalInKg * 1000 ;
        int lostWeightInOneDay250 = 250 ;
        int resultInDays250 = WeightToGoalInGr / lostWeightInOneDay250 ;
        System.out.println("Требуется " +  resultInDays250 + " дней, чтобы сбросить 7 кг.");


        int lostWeightInOneDay500 = 500 ;
        int resultInDay500 = WeightToGoalInGr /  lostWeightInOneDay500 ;
        System.out.println("Требуется " +  resultInDay500 + " дней, чтобы сбросить 7 кг.");
    }

    private static void Task3() {
        int bananasWeightGr = 80 ;
        int milkWeightGr = 105 ;
        int iceCreamGr = 100 ;
        int eggsGr = 70 ;


        int bananasForBreakfast = bananasWeightGr * 5 ;
        int milkForBreakfast = milkWeightGr * 2;
        int iceCreamForBreakfast = iceCreamGr * 2 ;
        int eggsForBreakfast = eggsGr * 4;
        int BreakfastWeightGr = bananasForBreakfast + milkForBreakfast + iceCreamForBreakfast + eggsForBreakfast ;
        System.out.println("Вес завтрака " + BreakfastWeightGr + " грамм");


        float BreakfastWeightInKg = BreakfastWeightGr / 1000f ;
        System.out.println("Вес завтрака " + BreakfastWeightInKg + " кг");
    }

    private static void Task2() {
        double Klichko = 78.2 ;
        double Anosov = 82.7;
        double weight = Klichko + Anosov;
        System.out.println( "Общий вес боксёров " + weight + " кг");

        double differenceWeight = Anosov - Klichko;
        System.out.println("Разница в весе " + differenceWeight + " кг");
    }

    private static void Task1() {
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
