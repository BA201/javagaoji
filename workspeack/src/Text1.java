import java.util.Scanner;

public class Text1 {


    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要比较的数的个数");
        int a=sc.nextInt();
        int[] f1=new int[a];
        for(int i=0;i<f1.length;i++){
System.out.println("请输入第"+ (i+1) + "个数");
     f1[i]=sc.nextInt();

        }
        int max=f1[0];
        for(int i=1;i<f1.length;i++)
        {
            if(max<f1[i])
            {
                 max=f1[i];
            }

        }
        System.out.println("最大的数是"+max);



    }

}
