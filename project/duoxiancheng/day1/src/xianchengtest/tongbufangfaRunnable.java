package xianchengtest;

public class tongbufangfaRunnable {




        public static void main(String[] args) {


            xianchengtest.mThread m1=new xianchengtest.mThread();
            xianchengtest.mThread m2=new xianchengtest.mThread();
            xianchengtest.mThread m3=new xianchengtest.mThread();
            m1.setName("窗口一");
            m2.setName("窗口二");
            m3.setName("窗口三");
            m1.start();
            m2.start();
            m3.start();

        }




    }



    class mmThread extends Thread
    {
        private static int x=1000;
        private static Object obj=new Object();


        @Override
        public void run() {

            while (true) {
                tongbu();

            }


        }

        private static synchronized void tongbu()
        {
            if(x>0)
            {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("这是第" + x + "张票"+Thread.currentThread().getName());
                x--;
            }
            else
            {
                return;
            }
        }
    }

