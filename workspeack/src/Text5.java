import java.util.Scanner;

public class Text5 {

    public static void main(String[] args)
    {
                Text5.jiu();

    }

    public static void jiu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入乘法表的个数");
        int x=sc.nextInt();
        int s=0;
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
            {
                s=i*j;
                System.out.print(i+"x"+j+"="+s+"\t\t");

            }
            System.out.println("");
        }
    }

}
