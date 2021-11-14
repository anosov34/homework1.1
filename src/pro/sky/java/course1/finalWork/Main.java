package pro.sky.java.course1.finalWork;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov S. A.", 1, 50_000);
        employees[1] = new Employee("Petrov N. V.", 3, 40_000);
        employees[2] = new Employee("Sidorov B.R.", 5, 340_000);
        employees[3] = new Employee("Anosov S.A.", 2, 456_000);
        employees[4] = new Employee("Kravchuk S.R.", 1, 34540_000);
        employees[5] = new Employee("Drozdov B.R.", 4, 55435_000);
        employees[6] = new Employee("Alekseev S.A.", 4, 54356_000);
        employees[7] = new Employee("Andropov N. V.", 5, 554_000);
        employees[8] = new Employee("Khrushcev B.R.", 2, 33_000);
        employees[9] = new Employee("Navalniy G.M.", 1, 29_000);

        getAllEmployeesInf();
        System.out.println("Общая сумма затрат на ЗП: " + calculateSalary());
        System.out.println("Средняя ЗП " + calculateAverageSalary());
        System.out.println("Максимальная ЗП у " + findMaxSalary());
        System.out.println("Минимальная ЗП у " + findMinSalary());
        printEmployeesFullName();
    }

    public static int calculateSalary() {
        int result = 0;
        for (Employee employee : employees) {
            result += employee.getSalary();
        }
        return result;
    }

    public static Employee findMinSalary() {
        int indexOfMinSalary = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < employees[indexOfMinSalary].getSalary()) {
                indexOfMinSalary = i;
            }
        }
        return employees[indexOfMinSalary];
    }

    public static Employee findMaxSalary() {
        int indexOfMaxSalary = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > employees[indexOfMaxSalary].getSalary()) {
                indexOfMaxSalary = i;
            }
        }
        return employees[indexOfMaxSalary];
    }

    public static int calculateAverageSalary() {
        return calculateSalary() / employees.length;
    }

    public static void printEmployeesFullName() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getFullName());
        }
    }

    public static void getAllEmployeesInf() {
        for (Employee employee : employees) {
            System.out.println("№ " + employee);
        }
    }
}

