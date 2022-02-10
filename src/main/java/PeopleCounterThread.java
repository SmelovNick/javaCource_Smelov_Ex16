public class PeopleCounterThread extends Thread{
    Road road;

    PeopleCounterThread (String name, Road road){
        super(name);
        this.road = road;
    }

    @Override
    public void run() {
        while(true){
            road.addPeople();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
