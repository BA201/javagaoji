package chouxiangtest2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class payrollSystem {
   static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

       Employee[] S=new Employee[2];
       S[0]=new salariedEmployee("小明",3,new Mydata(2000,9,28),3200);
       S[1]=new hourlyEmployee("小红",4,new Mydata(1222,12,43),7,320);


       for(int i=0;i<S.length;i++)
       {
           double si= S[i].earnings();
           System.out.println("请输入当前月份");
           int d=sc.nextInt();
           if(d==S[i].getBrithday().getMonth()){
               si+=500;
           System.out.println("工资增加500块");}
           System.out.println(S[i]);
           System.out.println("总工资是"+si);

           Calendar ss=Calendar.getInstance();
          int v= ss.get(Calendar.DAY_OF_WEEK_IN_MONTH);
          System.out.println(v);


       }
    }
}
