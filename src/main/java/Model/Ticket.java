package Model;

import java.util.Date;
import java.util.Map;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private EntryGate gate;
    private Date entryTime;
    private ParkingSlot parkingSlot;
    private Operator operator;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EntryGate getGate() {
        return gate;
    }

    public void setGate(EntryGate gate) {
        this.gate = gate;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
