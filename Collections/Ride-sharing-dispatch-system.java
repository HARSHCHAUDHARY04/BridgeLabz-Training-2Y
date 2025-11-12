import java.util.*;
public class RideSharingDispatch {
    static class RideRequest {
        String id;
        int priority;
        RideRequest(String id,int priority){ this.id=id; this.priority=priority; }
        public String toString(){ return id + "(p=" + priority + ")"; }
    }
    static class Driver {
        String id;
        Driver(String id){ this.id = id; }
        public String toString(){ return id; }
        public boolean equals(Object o){ return o instanceof Driver && ((Driver)o).id.equals(id); }
        public int hashCode(){ return Objects.hash(id); }
    }
    public static void main(String[] args){
        Queue<RideRequest> pending = new LinkedList<>();
        pending.add(new RideRequest("R1",5));
        pending.add(new RideRequest("R2",2));
        pending.add(new RideRequest("R3",8));
        Set<Driver> drivers = new HashSet<>(Arrays.asList(new Driver("D1"), new Driver("D2")));
        List<String> completed = new ArrayList<>();
        PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>((a,b) -> Integer.compare(b.priority, a.priority));
        priorityQueue.addAll(pending);
        while(!priorityQueue.isEmpty()){
            RideRequest req = priorityQueue.poll();
            Optional<Driver> assigned = drivers.stream().findAny();
            if(assigned.isPresent()){
                Driver d = assigned.get();
                System.out.println("Assigned " + d + " to " + req);
                completed.add(req.id + "->" + d.id);
                drivers.remove(d);
            } else {
                System.out.println("No drivers for " + req);
            }
            drivers.add(new Driver("D" + (new Random().nextInt(10)+3))); // drivers become available
        }
        System.out.println("Completed rides -> " + completed);
    }
}

