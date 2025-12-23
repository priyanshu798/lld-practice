package designPatterns.Factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equals("Car")) {
            return new Car();
        }
        else if (type.equals("Bike")) {
            return new Bike();
        }
        return null;
    }
}
