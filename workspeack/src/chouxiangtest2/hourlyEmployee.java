package chouxiangtest2;

public class hourlyEmployee extends Employee {
    private int wage;
    private int hour;

    public hourlyEmployee(String name, int number, Mydata brithday) {
        super(name, number, brithday);
    }

    public hourlyEmployee(String name, int number, Mydata brithday, int wage, int hour) {
        super(name, number, brithday);
        this.wage = wage;
        this.hour = hour;
    }

    public double earnings()
    {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "hourlyEmployee{" +super.toString();
    }
}
