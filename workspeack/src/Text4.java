import java.util.Scanner;

public class Text4 {


    public static void main( String[] args) {

     Text4.na();


    }

    public  static void na ()
    {
        Scanner sc=new Scanner(System.in);
        int wo=0;
        System.out.println("请输入年份");
        int s1=sc.nextInt();
        System.out.println("请输入月份");
        int s3=sc.nextInt();
        System.out.println("请输入今天是几号");
        int s2=sc.nextInt();

        switch(s3)
        {
            case 12:
                wo+=31;
            case 11:
                wo+=30;
            case 10:
                wo+=30;
            case 9:
                wo+=31;
            case 8:
                wo+=31;
            case 7:
                wo+=30;
            case 6:
            wo+=31;
            case 5:
                wo+=30;
            case 4:
                wo+=31;
            case 3:
                int x= s1%4==0 ?29:28;
                wo+=x;


            case 2:
                wo+=31;


            case 1:
                wo+=s2;



        }    System.out.println("今天是今年的第"+wo+"天");

    }

}
