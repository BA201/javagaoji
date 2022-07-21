package duixiangshuzu;

public class Account {
    public Account(double a)
    {
            balance=a;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;


    public void deposit(double q){

        if(q>this.balance)
        {
            System.out.println("余额已不足！请及时充值。");
            return;
        }
        this.balance-=q;
        System.out.println("取钱成功"+q);

    }

    public void withdraw(double w)
    {

        if(w>0)
        {
            this.balance+=w;
            System.out.println("存钱成功"+w);
        }
    }
}
