package xiancheng;

/**
 * 线程通信例子：两个线程打印从一打印直到100,要求交叉打印。
 */

public class xianchengtongxin {


    public static void main(String[] args) {

        wql w=new wql();
        Thread t1=new Thread(w);
        Thread t2=new Thread(w);
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
    }

}


class wql implements Runnable
{

    private  int x=1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();

                if (x <= 100) {

                    System.out.println(Thread.currentThread().getName() + x);
                    x++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    break;
                }
            }


        }
    }
}