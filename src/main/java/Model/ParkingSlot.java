package Model;

public class ParkingSlot{
     private int ParkingSlotNo;
     private VehicleType vehicleType;
     private Status status;
     private ParkingFloor parkingFloor;

     public int getParkingSlotNo() {
          return ParkingSlotNo;
     }

     public void setParkingSlotNo(int parkingSlotNo) {
          ParkingSlotNo = parkingSlotNo;
     }

     public VehicleType getVehicleType() {
          return vehicleType;
     }

     public void setVehicleType(VehicleType vehicleType) {
          this.vehicleType = vehicleType;
     }

     public Status getStatus() {
          return status;
     }

     public void setStatus(Status status) {
          this.status = status;
     }

     public ParkingFloor getParkingFloor() {
          return parkingFloor;
     }

     public void setParkingFloor(ParkingFloor parkingFloor) {
          this.parkingFloor = parkingFloor;
     }
}
