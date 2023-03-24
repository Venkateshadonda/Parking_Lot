package Model;

public class ElectricParkingSlot extends ParkingSlot{
    private ElectricCharger charger;

    public ElectricCharger getCharger() {
        return charger;
    }

    public void setCharger(ElectricCharger charger) {
        this.charger = charger;
    }
}
