package domain;

public class PC implements EQUIPMENT{

    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public PC() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDescription()
    {

        return "("+model+display+")";
    }

    @Override
    public String toString() {
        return "PC{" +
                 model +
               display +
                '}';
    }
}
