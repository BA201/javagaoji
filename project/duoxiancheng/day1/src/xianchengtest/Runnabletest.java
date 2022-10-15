package xianchengtest;

public class Runnabletest {
    public static void main(String[] args) {

        meThread m1=new meThread();
      Thread s= new Thread(m1);
      s.setName("线程1");
      s.start();
     Thread ss=new Thread(m1);
      ss.setName("线程二");
      ss.start();


    }


}


class meThread implements Runnable
{
    @Override
    public void run() {

        for (int i = 1; i < 100; i++) {
            if(i%2==0) {

                System.out.println(i + Thread.currentThread().getName());
            }

        }



    }
}
