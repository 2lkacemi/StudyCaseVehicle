public class Car extends Vehicle{

    private String color;
    private int horsePower;

    public Car() {
    }

    public Car(String brand, int ref_price, String color, int horsePower) {
        super(brand, ref_price);
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public double calculatePrice(int j) {
        return getHorsePower()*50;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
