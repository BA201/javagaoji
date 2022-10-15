package xianchengtest;

/**练习：创建两个分线程，其中一个线程遍历1-100以内的偶数，另一个遍历1-100以内的奇数。
 *
 */
public class xianchengtwo {
    public static void main(String[] args) {


        MyThread m1=new MyThread();
        MyThread2 m2=new MyThread2();
        m1.start();
        m2.start();

    }



}

class MyThread extends Thread
{
    @Override
    public void run() {
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+Thread.currentThread().getName());
            }
        }
    }
}
class MyThread2 extends Thread
{
    @Override
    public void run() {
        for(int i=1;i<=100;i++)
        {
            if(i%2==1)
            {
                System.out.println(i+Thread.currentThread().getName());
            }
        }
    }
}