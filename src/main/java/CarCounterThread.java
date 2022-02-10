public class CarCounterThread extends Thread{
    Road road;

    CarCounterThread (String name, Road road){
        super(name);
        this.road = road;
    }

    @Override
    public void run() {
        while(true){
            road.addCar();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
