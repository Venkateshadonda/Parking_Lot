package Controller;

import DTO.TicketRequestDTO;
import DTO.TicketResponseDTO;
import Model.Ticket;
import Service.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService=ticketService;
    }

    public TicketResponseDTO generateTicket(TicketRequestDTO requestDTO){
        Ticket ticket=ticketService.generateTicket(requestDTO.getVehicle(), requestDTO.getEntryGate());

        TicketResponseDTO responseDTO=new TicketResponseDTO();

        responseDTO.setEntryTime(ticket.getEntryTime());
        responseDTO.setParkingFloorNo(1);
        responseDTO.setParkingSlotNo(ticket.getParkingSlot().getParkingSlotNo());
        responseDTO.setVehicleNo(ticket.getVehicle().getVehicleNo());

        return responseDTO;
    }
}
