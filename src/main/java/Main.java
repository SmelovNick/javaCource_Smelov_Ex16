public class Main {
    public static void main(String[] args) throws InterruptedException {
        Road road = new Road();

        PeopleCounterThread peopleCounterThread = new PeopleCounterThread("peopleCounterThread", road);
        peopleCounterThread.start();
        PeopleTrafficLightSwitcherThread peopleTrafficLightSwitcherThread = new PeopleTrafficLightSwitcherThread("peopleTrafficLightSwitcherThread", road);
        peopleTrafficLightSwitcherThread.start();

        CarCounterThread carCounterThread = new CarCounterThread("carCounterThread", road);
        carCounterThread.start();
        CarTrafficLightSwitcherThread carTrafficLightSwitcherThread = new CarTrafficLightSwitcherThread("carTrafficLightSwitcherThread", road);
        carTrafficLightSwitcherThread.start();

        Thread.sleep(30000);
        System.exit(0);
    }
}
