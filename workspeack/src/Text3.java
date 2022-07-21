import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Text3 {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入你的成绩");
        int a=sc.nextInt();
        int s=a/10;
        System.out.println(s);

        switch(s)

        {

            case 10:
                System.out.println("奖励一辆宝马");
                break;
            case 9 :
                System.out.println("奖励一台电脑");
                break;
            case 8:
                System.out.println("奖励一直烧鸡");
break;
            default:
                System.out.println("奖励一个大嘴巴子");

        }


    }

}
