package parkingLot.exceptions;

public class ParkingLotIsFullException extends Throwable {
    public ParkingLotIsFullException() {
        super("Parking lot is full !!!");
    }
}
