package xianchengtongxin;

public class shengchanzhexiaofeizhe {
    public static void main(String[] args) {

       Clerk c=new Clerk();
       productor p=new productor(c);
       customer cx=new customer(c);
       p.setName("生产者1");
       cx.setName("消费者1");
       p.start();
       cx.start();

    }


}

class Clerk extends  Thread//产品
{
private int x=0;

    public synchronized void shengchan() {

        if(x<20)

        {
            x++;
            notify();
            System.out.println(Thread.currentThread().getName()+"开始生产第"+x+"个产品");
        }
        else
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void xiaofei() {

        if(x>0)
        {

            System.out.println(Thread.currentThread().getName()+"开始消费第"+x+"个产品");
            x--;
            notify();
        }
        else
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class productor extends Thread    //生产者

{
    private Clerk cleck;

    public productor(Clerk cleck) {
        this.cleck = cleck;
    }

    @Override
    public void run() {

        System.out.println(getName()+"开始生产产品......");
        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleck.shengchan();
        }

    }
}
class  customer extends  Thread    //消费者
{

    private Clerk clerk;

    public customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName()+"开始消费产品......");
       while(true)
       {
           try {
               sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           clerk.xiaofei();
       }

    }
}
