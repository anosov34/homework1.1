package pro.sky.java.course2.lesson2;

public class HeavyVehicle extends Vehicle {

    public HeavyVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
