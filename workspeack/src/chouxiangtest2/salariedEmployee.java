package chouxiangtest2;

import java.util.Scanner;

public class salariedEmployee extends Employee {

  static   Scanner sc=new Scanner(System.in);



    private double monthlysalary;

    public salariedEmployee(int monthlysalary) {
        this.monthlysalary = monthlysalary;
    }

    public salariedEmployee(String name, int number, Mydata brithday) {
        super(name, number, brithday);

    }

    public salariedEmployee(String name, int number, Mydata brithday, double monthlysalary) {
        super(name, number, brithday);
        this.monthlysalary = monthlysalary;
    }

    public double earnings()
{
return monthlysalary;
}

public String toString()
{
    return "salariedEmployee"+"{"+super.toString();
}
}
