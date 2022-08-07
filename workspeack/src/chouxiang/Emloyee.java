package chouxiang;

public abstract class Emloyee {

    private String mane;
    private int age;
    private  double salary;


    public  abstract void work();

    public Emloyee(String mane, int age, double salary) {
        this.mane = mane;
        this.age = age;
        this.salary = salary;
    }

    public Emloyee()
    {

    }

}
