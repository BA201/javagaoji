package domain;

public class Designer extends Programmer {
    private double bonus;
    private String zhi = "设计师";

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, EQUIPMENT equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public String stringto2()

    {
        return stringto1()+"\t\t"+bonus;
    }

    public String stringto()
    {
        return stringto1()+zhi+"\t"+bonus;
    }
public String tostring2()
{
    return
             bonus+""
      ;
}
    @Override
    public String toString() {
        return tostring()+zhi+"\t"+shebei()+"\t\t"+tostring2()+"\t\t\t"+tostring1();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
