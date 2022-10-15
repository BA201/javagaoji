package xiancheng;

/**
 * 银行有一个账户，有两个储户分别向同一个账户存3000元，每次存一千，存三次，每次存完打印账户余额。
 * 分析
 * 是否是多线程问题：是，因为有两个线程。
 * 是否有共享数据：有账户（余额）
 *
 */
public class yinhangcunqin {
    public static void main(String[] args) {
        Account acc=new Account(0);
        Customer cus=new Customer(acc);
        Customer cus2=new Customer(acc);
        cus.setName("客户一");
        cus2.setName("客户二");
        cus.start();
        cus2.start();


    }
}

class Account
{
    private double blank;
    public Account(double x)
    {
        this.blank=x;
    }

    public synchronized void getPosit(double money)
    {
        if(money>0)
        {
            blank+=money;
            System.out.println("存钱成功"+"余额为"+blank+Thread.currentThread().getName());
        }
        else
        {
            System.out.println("存钱不能是负数");
        }
    }

}


class Customer extends Thread
{
    private Account acc;

    public Customer(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {

        for(int i=0;i<3;i++)
        {
            acc.getPosit(1000);
        }

    }
}