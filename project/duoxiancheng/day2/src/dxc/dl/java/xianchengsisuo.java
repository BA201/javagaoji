package dxc.dl.java;


/**
 * 线程死锁问题演示
 *
 */

public class xianchengsisuo {


    public static void main(String[] args) {


        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();

        new Thread ()
        {
            @Override
            public void run() {
                synchronized (s1)
                {
                    s1.append("a");
                    s2.append("1");
                }
                synchronized (s2)
                {
                    s2.append("2");
                    s1.append("b");
                    System.out.println(s1);
                    System.out.println(s2);
                }


            }
        };



        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2)
                {
                    s1.append("c");
                    s2.append("3");
                }
                synchronized (s1)
                {
                    s2.append("4");
                    s1.append("d");
                    System.out.println(s1);
                    System.out.println(s2);
                }


            }
        });




    }





}
