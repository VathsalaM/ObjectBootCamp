package parkingLot;

import parkingLot.exceptions.ParkingLotIsFullException;

import java.util.ArrayList;

public class ParkingLotCollection {

    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();

    public boolean park(Car car) throws ParkingLotIsFullException {
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.isFull())
                continue;
            parkingLot.add(car);
            return true;
        }
        throw new ParkingLotIsFullException();
    }


    public void add(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }
}
