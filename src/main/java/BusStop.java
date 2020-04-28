import java.util.ArrayList;

public class BusStop {
    private ArrayList<Person> queue;

    public BusStop(){
        queue= new ArrayList<Person>();
    }

    public void addToQueue(Person person){
        this.queue.add(person);
    }

    public Person removeFromQueue(){
        return this.queue.remove(0);
    }
}
