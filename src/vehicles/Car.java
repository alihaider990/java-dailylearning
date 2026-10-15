package vehicles;

public class Car extends Vehicle{

    private int speedLimit ;

    public Car(){
        speedLimit = 90;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public void accelerate(){

    }

    @Override
    public void deaccelerate(){

    }
    public final void airBags(){
        System.out.println("4 air bags");
    }
}
