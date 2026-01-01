package parkingLot.feeStrategy;

public class BasicHourlyRateStrategy implements ParkingFeeStrategy{
    @Override
    public double calculateFee(String vehicleType, int duration, DurationType durationType) {
        //diff rates for diff car types
        switch (vehicleType.toLowerCase()) {
            case "car":
                return durationType == DurationType.HOURS ? duration * 10 : duration * 10 * 24;

            case "bike":
                return durationType == DurationType.HOURS ? duration * 5 : duration * 5 * 24;

            case "truck":
                return durationType == DurationType.HOURS ? duration * 20 : duration * 20 * 24;

            default:
                return durationType == DurationType.HOURS ? duration * 15 : duration * 15 * 24;

        }
    }
}
