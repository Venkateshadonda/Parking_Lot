import Controller.TicketController;
import DTO.TicketRequestDTO;
import DTO.TicketResponseDTO;
import Model.*;
import Repository.ParkingLotRepository;
import Service.TicketService;
import Strategy.CheckAvailableSlotStrategy;
import Strategy.CheckRandomAvailableSlotStrategy;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ParkingLotRepository parkingLotRepository=ParkingLotRepository.getInstance();
        CheckAvailableSlotStrategy checkAvailableSlotStrategy=new CheckRandomAvailableSlotStrategy();
        TicketService ticketService = new TicketService(parkingLotRepository, checkAvailableSlotStrategy);

        TicketController ticketController=new TicketController(ticketService);

        Operator operator1= new Operator();
        operator1.setName("Vishal");
        Operator operator2=new Operator();
        operator2.setName("Whales");

        Operator operator3=new Operator();
        operator3.setName("Eliza");

        ParkingSlot parkingSlot1=new ParkingSlot();
        parkingSlot1.setParkingSlotNo(1);
        parkingSlot1.setVehicleType(VehicleType.FOUR_WHEELER);
        parkingSlot1.setStatus(Status.OPEN);

        ParkingSlot parkingSlot2=new ParkingSlot();
        parkingSlot2.setParkingSlotNo(2);
        parkingSlot2.setVehicleType(VehicleType.SIX_WHEELER);
        parkingSlot2.setStatus(Status.OPEN);

        ParkingSlot parkingSlot3=new ParkingSlot();
        parkingSlot3.setParkingSlotNo(3);
        parkingSlot3.setVehicleType(VehicleType.TWO_WHEELER);
        parkingSlot3.setStatus(Status.OPEN);

        ParkingSlot parkingSlot4=new ParkingSlot();
        parkingSlot4.setParkingSlotNo(4);
        parkingSlot4.setVehicleType(VehicleType.FOUR_WHEELER);
        parkingSlot4.setStatus(Status.OPEN);

        ParkingSlot parkingSlot5=new ParkingSlot();
        parkingSlot5.setParkingSlotNo(5);
        parkingSlot5.setVehicleType(VehicleType.TWO_WHEELER);
        parkingSlot5.setStatus(Status.OPEN);

        List<ParkingSlot> parkingSlots1=new ArrayList<>();
        parkingSlots1.add(parkingSlot1);
        parkingSlots1.add(parkingSlot2);
        parkingSlots1.add(parkingSlot3);

        List<ParkingSlot> parkingSlots2=new ArrayList<>();
        parkingSlots2.add(parkingSlot4);
        parkingSlots2.add(parkingSlot5);


        ParkingFloor parkingFloor1=new ParkingFloor();
        parkingFloor1.setFloorNo(1);
        parkingFloor1.setOperator(operator1);
        parkingFloor1.setStatus(Status.OPEN);
        parkingFloor1.setParkingSlot(parkingSlots1);

        ParkingFloor parkingFloor2=new ParkingFloor();
        parkingFloor2.setFloorNo(2);
        parkingFloor2.setOperator(operator2);
        parkingFloor2.setStatus(Status.OPEN);
        parkingFloor2.setParkingSlot(parkingSlots2);

        List<ParkingFloor> parkingFloors=new ArrayList<>();
        parkingFloors.add(parkingFloor1);
        parkingFloors.add(parkingFloor2);

        Gate entryGate1=new EntryGate();
        entryGate1.setGateType(GateType.ENTRY);
        entryGate1.setOperator(operator1);
        entryGate1.setId(1);

        Gate entryGate2=new EntryGate();
        entryGate2.setGateType(GateType.ENTRY);
        entryGate1.setId(2);
        entryGate2.setOperator(operator2);

        Gate exitGate=new ExitGate();
        exitGate.setId(3);
        exitGate.setGateType(GateType.EXIT);
        exitGate.setOperator(operator3);

        List<Gate> gates=new ArrayList<>();
        gates.add(entryGate1);
        gates.add(entryGate2);
        gates.add(exitGate);

        Map<VehicleType, Integer> baseRate=new HashMap<>();
        baseRate.put(VehicleType.TWO_WHEELER,100);
        baseRate.put(VehicleType.FOUR_WHEELER, 120);
        baseRate.put(VehicleType.SIX_WHEELER,140);
        baseRate.put(VehicleType.EIGHT_WHEELER, 160);


        ParkingLot parkingLot=new ParkingLot();
        parkingLot.setAddress("Plot no 135, Hastinapuram, Hyderabad");
        parkingLot.setName("Venkatesh Parking Lot");
        parkingLot.setId(1);
        parkingLot.setParkingFloors(parkingFloors);
        parkingLot.setGates(gates);
        parkingLot.setBaseRate(baseRate);



        Vehicle vehicle = new Vehicle();
        System.out.println("Enter the Vehicle No:");
        String vehicleNo=sc.next();
        vehicle.setColor("Blue");
        vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
        vehicle.setId(1);
        vehicle.setVehicleNo(vehicleNo);

        parkingLotRepository.save(parkingLot);

        TicketRequestDTO requestDTO=new TicketRequestDTO();
        requestDTO.setEntryGate((EntryGate) entryGate1);
        requestDTO.setVehicle(vehicle);

        TicketResponseDTO responseDTO=ticketController.generateTicket(requestDTO);

        System.out.println("Your Vehicle No is "+responseDTO.getVehicleNo());
        System.out.println("Entry Gate is "+requestDTO.getEntryGate().getId());
        System.out.println("Go To ParkingFloor is " + responseDTO.getParkingFloorNo() + " And Got to ParkingSlot is "
                +responseDTO.getParkingSlotNo());
        System.out.println("Your Entry Time is " + responseDTO.getEntryTime());

    }
}
