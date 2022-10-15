package xianchengtongxin;


import java.util.concurrent.*;

/**
 *
 * 创建线程的方式三，实现Callable接口               -------jdk5.0新增
 */

public class callableduoxiancheng {

    public static void main(String[] args) {


        cal c=new cal();
        FutureTask ft=new FutureTask(c);
        Thread te=new Thread(ft);
        te.setName("线程一");
        te.start();
        try {
           Object sum= ft.get();
            System.out.println("总数是"+sum+ te.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }

}



class cal implements Callable
{
    int sum=0;


    @Override
    public Object call() throws Exception {

        for(int i=1;i<=100;i++)
        {
            sum+=i;
        }
        return sum;
    }
}
