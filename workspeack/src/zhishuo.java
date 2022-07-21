import java.util.Scanner;

public class zhishuo {


    public static void main(String[]  args)
    {
      zhishuo.zhi();

    }

    public static void  zhi()
    {

        boolean x=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查看的数");
        int j=sc.nextInt();
//            优化算法效率
//        获取系统当前时间
        long stat = System.currentTimeMillis();
        leabl :for(int i=2;i<=j ;i++){
//            for (int s = 2; s < i; s++)
                for(int s=2;s<=Math.sqrt(i);s++)
            {
//           方法一： 优化方法1将是s小的值开根号
//
                if(i%s==0)
                {
                x=false;}
                break leabl;

            }
            if(x==true)
            {
                System.out.println("该数是质数"+i);
            }
                x=true;

        }
        //            获取系统当前时间
        long end = System.currentTimeMillis();
//   输出运算时间
        long time =end-stat;
        System.out.println("运算时间为"+time);


    }

}
