package parkingLot.parkingSpot;

import parkingLot.vehicleFactory.Vehicle;

public class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot(String spotType, int spotNumber) {
        super(spotType, spotNumber);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Car".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
