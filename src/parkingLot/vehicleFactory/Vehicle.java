package parkingLot.vehicleFactory;

import parkingLot.feeStrategy.DurationType;
import parkingLot.feeStrategy.ParkingFeeStrategy;

public abstract class Vehicle {
    private String licensePlate;
    private String vehicleType;
    private ParkingFeeStrategy feeStrategy;

    public Vehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.feeStrategy = feeStrategy;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    //method to calculate fee based on duration and type
    public double calculateFee(int duration, DurationType durationType) {
        return feeStrategy.calculateFee( this.vehicleType, duration, durationType);
    }
}
