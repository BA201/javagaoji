package xianchengtest;

import static java.lang.Thread.*;

public class Threadtest {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
//        t1.setName("线程一");
//        t1.start();
        t2.setName("线程二");
        t2.start();
        Thread.currentThread().setName("线程main");

        for (int i = 1; i <= 100; i++) {
            if(i%2==0)
            {
                System.out.println(i+Thread.currentThread().getName());
            }

        }
       int x= currentThread().getPriority();
        System.out.println(x);


    }

}


class Thread1 extends Thread
{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i%2==0)
            {
                System.out.println(i+Thread.currentThread().getName());
            }
        }



    }
}


class Thread2 extends Thread
{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i%2==1)
            {
                System.out.println(i+Thread.currentThread().getName());
            }
        }



    }
}