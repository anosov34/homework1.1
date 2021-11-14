package pro.sky.java.course2.lesson2;

public class Truck extends HeavyVehicle {

    public Truck(String modelName, int wheelsCount) {
        super (modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
