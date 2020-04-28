import java.util.ArrayList;

public class Bus {
    private ArrayList<Person> passengers;
    private int capacity;
    private String destination;

    public Bus(int capacity){
        this.capacity= capacity;
        this.passengers= new ArrayList<Person>();
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        if(this.getPassengerCount()< this.capacity){
            this.passengers.add(person);
        }
    }

    public Person removePassenger(){
        return this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        Person person= busStop.removeFromQueue();
        this.addPassenger(person);
    }







}
