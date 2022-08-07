package chouxiangtest2;

import chouxiang.Manager;

public abstract class Employee {

    public Employee(){

    }

    public Employee(String name , int number, Mydata brithday){
        this.name=name;
        this.brithday=brithday;
        this.number=number;

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Mydata getBrithday() {
        return brithday;
    }

    private String name;
private int number;
private Mydata brithday;



public abstract double earnings();


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", number=" + number +
                ", brithday=" + brithday.toDataStirng() +
                '}';
    }
}
