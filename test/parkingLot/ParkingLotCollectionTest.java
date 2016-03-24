package parkingLot;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import parkingLot.exceptions.ParkingLotIsFullException;

import static org.junit.Assert.assertTrue;

public class ParkingLotCollectionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void should_park_a_car_in_parking_lot() throws ParkingLotIsFullException {
        ParkingLot parkingLot = new ParkingLot(15);
        ParkingLotCollection parkingLotCollection = new ParkingLotCollection();
        parkingLotCollection.add(parkingLot);
        assertTrue(parkingLotCollection.park(new Car()));
    }

    @Test
    public void should_throw_an_parkingLotFullException_when_parking_lot_is_full() throws ParkingLotIsFullException {
        ParkingLot parkingLot = new ParkingLot(0);
        ParkingLotCollection parkingLotCollection = new ParkingLotCollection();
        parkingLotCollection.add(parkingLot);
        thrown.expect(ParkingLotIsFullException.class);
        parkingLotCollection.park(new Car());
    }
    @Test
    public void should_handle_more_than_one_parking_lot_and_park_car() throws ParkingLotIsFullException {
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(2);
        ParkingLotCollection parkingLotCollection = new ParkingLotCollection();
        parkingLotCollection.add(parkingLot1);
        parkingLotCollection.add(parkingLot2);
        parkingLotCollection.park(new Car());
        parkingLotCollection.park(new Car());
        parkingLotCollection.park(new Car());
    }
    @Test
    public void should_throw_an_exception_when_all_the_lots_are_full() throws ParkingLotIsFullException {
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(1);
        ParkingLotCollection parkingLotCollection = new ParkingLotCollection();
        parkingLotCollection.add(parkingLot1);
        parkingLotCollection.add(parkingLot2);
        parkingLotCollection.park(new Car());
        parkingLotCollection.park(new Car());
        thrown.expect(ParkingLotIsFullException.class);
        parkingLotCollection.park(new Car());
    }
}