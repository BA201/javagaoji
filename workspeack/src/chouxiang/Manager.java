package chouxiang;

public class Manager extends Emloyee{

   double  money;
    @Override
    public void work() {
        System.out.println("我是管理者！");
    }

    public Manager(double money)
    {
        super();
        this.money=money;
    }

    public Manager(String mane, int age, double salary, double money) {
        super(mane, age, salary);
        this.money = money;
    }
}
