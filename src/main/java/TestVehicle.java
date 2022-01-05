import java.util.ArrayList;



public class TestVehicle {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Camion c1 = new Camion("Daf", 50, 25);
        Camion c2 = new Camion("Volvo", 50, 30);

        Car v1 = new Car("BMW", 50, "blanche", 25);
        Car v2 = new Car("Audi", 50, "grise", 25);

        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(v1);
        vehicles.add(v2);

        for (Vehicle p : vehicles) {
            if (p instanceof Car) {
                System.out.println("je suis une voiture" + p.getBrand() + " " + ((Car) p).getColor());
            } else {
                System.out.println("je suis une voiture" + p.getBrand() + " " + ((Camion) p).getCapacity());
            }
        }

        int capacity = 0;
        for (Vehicle camion : vehicles) {
            if(camion instanceof Camion){
                capacity = capacity +((Camion) camion).getCapacity();
            }
        }
        System.out.println("capacité totale est: "+ capacity);
    }
}
