public class PeopleTrafficLightSwitcherThread extends Thread{
    Road road;

    PeopleTrafficLightSwitcherThread (String name, Road road){
        super(name);
        this.road = road;
    }

    @Override
    public void run() {
        while (true){
            road.enableTrafficLightForPeople();
        }
    }
}
