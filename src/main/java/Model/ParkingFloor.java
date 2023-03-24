package Model;

import java.util.List;

public class ParkingFloor{
    private int floorNo;
    private List<ParkingSlot> parkingSlot;
    private Status status;
    private Operator operator;

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public List<ParkingSlot> getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(List<ParkingSlot> parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
