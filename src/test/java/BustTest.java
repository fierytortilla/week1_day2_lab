import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BustTest {

    private Person person;
    private Bus bus;
    private BusStop busStop;

    @Before
    public void before(){
        int capacity= 5;
        person= new Person();
        bus= new Bus(capacity);
        busStop= new BusStop();
    }

    @Test
    public void canCountPassengers(){
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
        bus.addPassenger(new Person());
        bus.addPassenger(new Person());
        bus.addPassenger(new Person());
        bus.addPassenger(new Person());
        bus.addPassenger(new Person());
        assertEquals(5, bus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        Person person= bus.removePassenger();
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canPickUpPassenger(){
        busStop.addToQueue(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.getPassengerCount());
    }



}
