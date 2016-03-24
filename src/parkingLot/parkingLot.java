package parkingLot;

import java.util.ArrayList;

/*
    Job : to park a car in specific place
 */
public class ParkingLot {

    private final int size;
    private ArrayList<Car> parkingSpace = new ArrayList<>();

    public ParkingLot(int size) {
        this.size = size;
    }

    public boolean isFull() {
        return parkingSpace.size() >= size;
    }

    public void add(Car car) {
        parkingSpace.add(car);
    }

    public boolean check() {
        return parkingSpace.size() >= size*0.8;
    }
}
