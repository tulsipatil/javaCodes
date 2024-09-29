interface Participant{
    void notifyEvent();
}

class Individual implements Participant{
    String name;
    Individual(String n){
        name = n;
    }
    public void notifyEvent(){
        System.out.println("Event notification sent to " + name);
    }
}

class Organization implements Participant{
    String name;
    Organization(String n){
        name = n;
    }
    public void notifyEvent(){
        System.out.println("Event notification sent to " + name);
    }
}

class EventOrganizer {
    Participant person[] = new Participant[100];
    int count = 0;

    void registerParticipants(Participant p){
        person[count++] = p;
    }
    void notifyAllParticipants(){
        for(int i = 0; i<count; i++){
            person[i].notifyEvent();
        }
    }
}

public class Interfaces {
    public static void main(String[] args) {
        EventOrganizer s = new EventOrganizer();
        Individual p1 = new Individual("Alice");
        Organization p2 = new Organization("TechCorp");
        s.registerParticipants(p1);
        s.registerParticipants(p2);
        s.notifyAllParticipants();
    }
}
