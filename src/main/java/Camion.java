public class Camion extends Vehicle{

    private int capacity;

    public Camion() {
    }

    @Override
    public double calculatePrice(int j) {
        return getCapacity()*25;
    }

    public Camion(String brand, int ref_price, int capacity) {
        super(brand, ref_price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
