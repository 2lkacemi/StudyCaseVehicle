public abstract class Vehicle {

    private String brand;
    private int ref_price;

    public Vehicle() {
        super();
    }

    public Vehicle(String brand, int ref_price) {
        super();
        this.brand = brand;
        this.ref_price = ref_price;
    }

    public abstract double calculatePrice(int j);

    public void showDescription(){
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRef_price() {
        return ref_price;
    }

    public void setRef_price(int ref_price) {
        this.ref_price = ref_price;
    }
}
