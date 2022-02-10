public class CarTrafficLightSwitcherThread extends Thread{
    Road road;

    CarTrafficLightSwitcherThread (String name, Road road){
        super(name);
        this.road = road;
    }

    @Override
    public void run() {
        while(true){
            road.enableTrafficLightForCar();
        }
    }
}
