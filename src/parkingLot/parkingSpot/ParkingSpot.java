package parkingLot.parkingSpot;

import parkingLot.vehicleFactory.Vehicle;

public abstract class ParkingSpot {
    private Vehicle vehicle;
    private boolean isOccupied;
    private int spotNumber;
    private String spotType;

    public ParkingSpot(String spotType, int spotNumber) {
        this.spotType = spotType;
        this.spotNumber = spotNumber;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle) {
        if (isOccupied()) {
            throw new IllegalStateException("Spot is already occupied");
        }
        if (!canParkVehicle(vehicle)) {
            throw new IllegalArgumentException("This spot is not available for this vehicle");

        }
        this.isOccupied = true;
        this.vehicle = vehicle;
    }

    public void vacate() {
        if (!isOccupied) {
            throw new IllegalStateException("Spot is already vacated");
        }

        this.isOccupied = false;
        this.vehicle = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSpotType() {
        return spotType;
    }
}
