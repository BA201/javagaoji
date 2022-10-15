package xianchengchuangjian;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        threadd td=new threadd();
        ExecutorService sv= Executors.newFixedThreadPool(10);
        sv.execute(td);
        sv.shutdown();

    }





}
class threadd implements  Runnable
{
    @Override
    public void run() {
        Thread.currentThread().setName("线程一");
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+Thread.currentThread().getName());
            }
        }
    }
}