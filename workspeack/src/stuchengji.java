import java.util.Scanner;

public class stuchengji {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生人数");
        int s=sc.nextInt();
        int[] cj=new int[s];
        for(int i=0;i<cj.length;i++)
        {
            System.out.println("请输入第"+(i+1)+"位同学成绩");
            int ss=sc.nextInt();

             cj[i]=ss;
        }
        int sum=0;
        for(int i=0;i<cj.length;i++)
        {
            if(cj[i]>sum)
            {
                sum=cj[i];
            }
        }
        System.out.println("最大成绩是"+sum);

        for(int i=0;i<cj.length;i++)
        {
            int c=cj[i];
            if(c>sum-10)
            {
                c=1;
            }
            else
            if(c>sum-20)
            {
                c=2;
            }
            else
            if(c>sum-30)
            {
                c=3;
            }
           else
            {
                c=4;
            }

            switch (c)
            {
                case 1:
                    System.out.println("第"+(i+1)+"位同学成绩为A");
                    break;
                case 2:
                    System.out.println("第"+(i+1)+"位同学成绩为B");
                    break;
                case 3:
                    System.out.println("第"+(i+1)+"位同学成绩为C");
                    break;
                case 4:
                    System.out.println("第"+(i+1)+"位同学成绩为D");
                    break;
            }
        }

    }


}
