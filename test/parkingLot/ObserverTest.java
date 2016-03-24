package parkingLot;

import org.junit.Test;
import parkingLot.exceptions.CarIsAlreadyPresentException;
import parkingLot.exceptions.ParkingLotIsFullException;
import parkingLot.observer.Assistant;

import static org.junit.Assert.assertEquals;

public class ObserverTest {
    @Test
    public void should_update_the_information_when_someThing_changes_in_parking_lot() throws CarIsAlreadyPresentException, ParkingLotIsFullException {
        ParkingLot parkingLot1 = new ParkingLot(10);
        ParkingLotCollection parkingLotCollection = new ParkingLotCollection();
        Assistant assistant = new Assistant();
        parkingLotCollection.addObserver(assistant);
        String expected = "0";
        String actual = assistant.summary();
        assertEquals(expected, actual);
        parkingLotCollection.add(parkingLot1);
        parkingLotCollection.park(new Car(1));
        parkingLotCollection.park(new Car(2));
        parkingLotCollection.park(new Car(3));
        parkingLotCollection.park(new Car(4));
        parkingLotCollection.park(new Car(5));
        parkingLotCollection.park(new Car(6));
        parkingLotCollection.park(new Car(7));
        parkingLotCollection.park(new Car(8));
        parkingLotCollection.park(new Car(9));
        expected = "8";
        actual = assistant.summary();
        assertEquals(expected, actual);
    }
}