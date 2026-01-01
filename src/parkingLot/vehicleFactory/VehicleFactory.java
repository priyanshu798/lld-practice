package parkingLot.vehicleFactory;

import parkingLot.feeStrategy.ParkingFeeStrategy;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType, String licensePlate, ParkingFeeStrategy feeStrategy) {
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new CarVehicle(licensePlate, vehicleType, feeStrategy);
            case "bike":
                return new BikeVehicle(licensePlate, vehicleType, feeStrategy);
            default:
                return new OtherVehicle(licensePlate, vehicleType, feeStrategy);
        }
    }
}
