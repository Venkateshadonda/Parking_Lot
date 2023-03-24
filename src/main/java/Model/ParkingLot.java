package Model;

import java.util.List;
import java.util.Map;

public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public Map<VehicleType, Integer> getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Map<VehicleType, Integer> baseRate) {
        this.baseRate = baseRate;
    }

    private Map<VehicleType, Integer> baseRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}
