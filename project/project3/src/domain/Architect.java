package domain;

public class Architect extends Designer {

    private double stock;
    private String zhi="架构师";

    public Architect(int id, String name, int age, double salary, EQUIPMENT equipment, double bonus, double stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public String stringto3()
    {
        return stringto1()+zhi+"\t"+getBonus()+"\t"+stock;
    }
    public String stringto()
    {
        return stringto3();
    }
    @Override
    public String toString() {
        return tostring()+zhi+"\t"+shebei()+"\t\t"+tostring2()+"\t"+
                stock+"\t"+tostring1()
              ;
    }

    public Architect() {
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
}
