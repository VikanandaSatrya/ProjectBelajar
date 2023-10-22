public class Belajar_Java_16 {
    public static void main(String[] args) {

        Object SuperCar = new Vehicle(0, 0);

        System.out.println(((Vehicle) SuperCar).getSpeed());

        Vehicle SuperTruck = new Vehicle(0,0);

        System.out.println(SuperCar.equals(SuperTruck));
        System.out.println(SuperCar.hashCode());
        System.out.println(SuperCar.getClass());
        System.out.println(SuperCar.getClass().getName());

        if(SuperCar.getClass() == SuperTruck.getClass()){
            System.out.println("The same");
        }
        System.out.println();

        System.out.println(SuperCar.getClass().getSuperclass());

        System.out.println(SuperCar.toString());

        int randNum = 100;
        System.out.println(Integer.toString(randNum));

        SuperTruck.setWheel(6);

        Vehicle SuperTruck2 = (Vehicle) SuperTruck.clone();

        System.out.println(SuperTruck2.getWheel());




    }
}
