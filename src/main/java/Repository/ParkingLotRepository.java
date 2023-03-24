package Repository;

import Model.Gate;
import Model.ParkingLot;
import Model.ParkingSlot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    private static ParkingLotRepository instance;

    private ParkingLotRepository(){}
    Map<Long, ParkingLot> parkingLotMap=new HashMap<>();
    Map<Gate, ParkingLot> parkingLotGateMap=new HashMap<>();

    public ParkingLot save(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        for(Gate gate:parkingLot.getGates()){
            parkingLotGateMap.put(gate, parkingLot);
        }
        return parkingLot;
    }

    public ParkingLot getParkingLotWhereGateContains(Gate gate){
        if(parkingLotGateMap.containsKey(gate))
            return parkingLotGateMap.get(gate);
        return null;
    }

    public static ParkingLotRepository getInstance() {
        if(instance==null)
            instance=new ParkingLotRepository();
        return instance;
    }
}
