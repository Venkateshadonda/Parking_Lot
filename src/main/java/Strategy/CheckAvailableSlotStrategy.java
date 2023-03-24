package Strategy;

import Model.ParkingLot;
import Model.ParkingSlot;
import Model.VehicleType;

public interface CheckAvailableSlotStrategy {
    public ParkingSlot checkAvailableParkingSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
