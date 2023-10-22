public class Vehicle extends Crash implements Belajar_java_15, Cloneable{

    int numWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;

    public int getWheel(){
        return this.numWheels;
    }

    public void setWheel(int numWheels){
        this.numWheels = numWheels;
    }

    public double getSpeed(){
        return this.theSpeed;
    }

    public void setSpeed(double speed){
        this.theSpeed = speed;
    }

    public Vehicle(int wheels, double speed){
        this.numWheels = wheels;
        this.theSpeed = speed;
    }
    public void setCarStrength(int carStrength){
        this.carStrength = carStrength;




    }

    public int getCarStrength(){
        return this.carStrength;
    }

    public String toString(){
        return "aselole jos";
    }

    public Object clone(){
        Vehicle car;

        try{
            car = (Vehicle) super.clone();
        }
        catch(CloneNotSupportedException e){
            return null;
        }
        return car;
    }

}
