package dxc.dl.java;

import java.util.concurrent.locks.ReentrantLock;

public class Locktest {
    public static void main(String[] args) {
        threadn t=new threadn();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }





}


class threadn implements Runnable
{
    private int x=100;
    ReentrantLock lock=new ReentrantLock(true);


    @Override
    public void run() {

        while(true) {
            try {
                lock.lock();
                if (x > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("卖票" + "票号" + x + Thread.currentThread().getName());
                    x--;
                } else {
                    break;

                }
            }finally {
                lock.unlock();
            }
        }

    }
}