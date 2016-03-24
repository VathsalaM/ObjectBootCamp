package parkingLot;

import parkingLot.exceptions.CarIsAlreadyPresentException;
import parkingLot.exceptions.ParkingLotIsFullException;

import java.util.*;
/*
    Job :
        add parkingLot
        add car to parking lot if there is free space
        add observers and update them with changes;
 */

public class ParkingLotCollection {

    private List<ParkingLot> parkingLots = new ArrayList<>();
    private Set<Car> listOfCars = new HashSet<>();
    private ArrayList<parkingLot.observer.Observer> observers = new ArrayList<>();


    public boolean park(Car car) throws ParkingLotIsFullException, CarIsAlreadyPresentException {
        for (ParkingLot parkingLot : parkingLots) {
            if(parkingLot.check())
                update();
            if (parkingLot.isFull())
                continue;
            return parkCarInParkingLot(car,parkingLot);
        }
        throw new ParkingLotIsFullException();
    }

    private boolean parkCarInParkingLot(Car car, ParkingLot parkingLot) throws CarIsAlreadyPresentException {
        if (listOfCars.contains(car))
            throw new CarIsAlreadyPresentException();
        parkingLot.add(car);
        listOfCars.add(car);
        return true;
    }

    private void update() {
        for (parkingLot.observer.Observer observer : observers) {
            observer.update(listOfCars.size());
        }
    }

    public void addObserver(parkingLot.observer.Observer observer){ observers.add(observer);}

    public void add(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }
}
