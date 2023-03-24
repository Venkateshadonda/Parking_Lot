package DTO;

import Model.EntryGate;
import Model.Vehicle;

import java.util.Map;

public class TicketRequestDTO {
    private Vehicle vehicle;
    private EntryGate entryGate;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }
}
