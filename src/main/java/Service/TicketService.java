package Service;

import Model.*;
import Repository.ParkingLotRepository;
import Strategy.CheckAvailableSlotStrategy;

import java.util.Date;
import java.util.Map;

public class TicketService {
    private ParkingLotRepository parkingLotRepository;
    private CheckAvailableSlotStrategy checkAvailableSlot;
    public TicketService(ParkingLotRepository parkingLotRepository, CheckAvailableSlotStrategy checkAvailableSlot){
        this.parkingLotRepository=parkingLotRepository;
        this.checkAvailableSlot=checkAvailableSlot;
    }

    public Ticket generateTicket(Vehicle vehicle, EntryGate gate){
        ParkingSlot parkingSlotAvailable= checkAvailableSlot.checkAvailableParkingSlot(
                parkingLotRepository.getParkingLotWhereGateContains(gate), vehicle.getVehicleType());

        Ticket ticket=new Ticket();
        ticket.setGate(gate);
        ticket.setEntryTime(new Date());
        ticket.setParkingSlot(parkingSlotAvailable);
        ticket.setVehicle(vehicle);
        ticket.setOperator(gate.getOperator());

        return ticket;
    }
}
