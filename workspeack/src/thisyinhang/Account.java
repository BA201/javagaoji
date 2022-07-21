package thisyinhang;

public class Account {
    public Account(int a,double b,double c)
    {
        id=a;
        balance=b;
        annualInterestRate=c;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    private int id;
private double balance;//余额
private double annualInterestRate;//年利率

    public void withdraw(double a)//取钱
    {
        if(a>balance)
        {
            System.out.println("余额已不足，请及时充值！");
            return;
        }
        if(a<0)
        {
            System.out.println("请输入正确得数");
            return;
        }
        balance-=a;
        System.out.println("成功取出"+a);
    }

    public void deposit(double b)
    {
        if(b>0)
        {
            balance+=b;
            System.out.println("成功存入"+b);
        }
    }

}
