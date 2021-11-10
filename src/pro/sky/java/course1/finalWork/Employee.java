package pro.sky.java.course1.finalWork;

public class Employee {
        private static int counter;
        private final String fullName;
        private final int id;
        private int salary;
        private int department;



    public Employee(String fullName, int department, int salary) {
            this.fullName = fullName;
            this.department = department;
            this.salary = salary;
            id = counter;
            counter++;
        }

        public String getFullName() {
            return fullName;
        }

        public int getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        public int getId() {
            return id;
    }

        public void setDepartment(int department) {
            this.department = department;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }


    @Override
    public String toString() {
        return "Employee: " + fullName + ", department: " + department + ", salary: " + salary + ", id:" + id;
    }

}

