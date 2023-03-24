package Strategy;

import Model.*;

public class CheckRandomAvailableSlotStrategy implements CheckAvailableSlotStrategy {
    @Override
    public ParkingSlot checkAvailableParkingSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor parkingFloor:parkingLot.getParkingFloors()){
            for(ParkingSlot parkingSlot:parkingFloor.getParkingSlot()){
                if(parkingSlot.getVehicleType().equals(vehicleType) && parkingSlot.getStatus().equals(Status.OPEN))
                    return parkingSlot;
            }
        }
        return null;
    }
}
