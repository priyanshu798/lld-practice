package parkingLot.parkingSpot;

import parkingLot.vehicleFactory.Vehicle;

public class BikeParkingSpot extends ParkingSpot{
    public BikeParkingSpot(String spotType, int spotNumber) {
        super(spotType, spotNumber);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Bike".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
