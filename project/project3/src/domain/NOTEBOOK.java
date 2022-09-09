package domain;

public class NOTEBOOK implements EQUIPMENT {

private  String model;
private double price;

    public NOTEBOOK(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public NOTEBOOK() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription()
    {
        return "("+model+price+")";
    }

    @Override
    public String toString() {
        return "NOTEBOOK{" +
            model +
            price +
                '}';
    }
}
