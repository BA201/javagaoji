
/**
 * 多线程的创建，继承与Thread类的方式。
 * 1：需要创建一个继承与Thread类的子类，然后重写其run方法。---->将此线程执行的操作生命在run()中。
 * 2：创建Thread类的子类的对象，并执行其start();方法。
 * 例子：遍历100以内的所有偶数。
 */
public class ThreadTest {
    public static void main(String[] args) {

        threads ts=new threads();
        ts.start();
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"wowoowwoo");
            }
        }


    }



}
class threads extends Thread
{
    @Override
    public void run() {

        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }


    }
}