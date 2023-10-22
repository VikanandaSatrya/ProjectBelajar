public abstract class Crash {
    boolean carDriveAble = true;

    public void youCrash(){
        this.carDriveAble = false;
    }

    public abstract void setCarStrength(int carStrength);

    public int getCarStrength()  {
        return 0;
    }
}
