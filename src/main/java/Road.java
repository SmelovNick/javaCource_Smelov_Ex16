public class Road {
    int person=0;
    int cars=0;

    public synchronized void addPeople() {
        try{
            while(person>4){
                wait();
            }
            person++;
            System.out.printf("У светофора стоят %d человек\n", person);
            notify();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public synchronized void enableTrafficLightForPeople() {
        try{
            while(person<5){
                wait();
            }
            person=0;
            System.out.println("Светофор для пешеходов включен");
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void addCar(){
        try {
            while (cars > 3) {
                wait();
            }
            cars++;
            System.out.printf("У светофора стоят %d машин\n", cars);
            notify();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public synchronized void enableTrafficLightForCar() {
        try{
            while(cars<4){
                wait();
            }
            cars=0;
            System.out.println("Светофор для машин включен");
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
