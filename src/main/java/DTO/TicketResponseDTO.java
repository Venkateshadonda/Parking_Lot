package DTO;

import java.util.Date;

public class TicketResponseDTO {
    private Date EntryTime;
    private String VehicleNo;
    private int ParkingFloorNo;
    private int ParkingSlotNo;

    public Date getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(Date entryTime) {
        EntryTime = entryTime;
    }

    public String getVehicleNo() {
        return VehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        VehicleNo = vehicleNo;
    }

    public int getParkingFloorNo() {
        return ParkingFloorNo;
    }

    public void setParkingFloorNo(int parkingFloorNo) {
        ParkingFloorNo = parkingFloorNo;
    }

    public int getParkingSlotNo() {
        return ParkingSlotNo;
    }

    public void setParkingSlotNo(int parkingSlotNo) {
        ParkingSlotNo = parkingSlotNo;
    }
}
