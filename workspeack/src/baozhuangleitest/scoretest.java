package baozhuangleitest;

import java.util.Scanner;
import java.util.Vector;

public class scoretest {
  static   Scanner sc=new Scanner(System.in);
   static Vector v=new Vector();

    static int max=0;
    public static void main(String[] args) {

        int i=0;
        for(;;) {

            System.out.println("请输入第" + i + "个成绩");
            int s = sc.nextInt();
            if (s < 0)
            {
                break;
            }
            if(s>100)
            {
                System.out.println("成绩无效，请重新输入！");
                continue;
            }
            Integer l=s;
            v.addElement(l);
            if(l>max)
            {
                max=l;
            }
         i++;
        }
       scoretest k= new scoretest();
        k.ji(v);

    }


    public  void ji(Vector a)
    {
        for(int i=0; i<a.size();i++)
        {
            Object z=a.elementAt(i);
         int s=(int) z;
         if (s>=max-10)
         {
             System.out.println("A");
             continue;
         }
         if (s>=max-20)
         {
             System.out.println("B");
         continue;}
         if(s>=max-30)
         {
             System.out.println("C");
             continue;
         }
         if (s>=max-40)
         {
             System.out.println("D");
         }
         else {
             System.out.println("不及格！");
         }

        }
        System.out.println("最大成绩是"+max);

    }



}
