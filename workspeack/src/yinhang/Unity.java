package yinhang;

import java.util.Locale;
import java.util.Scanner;

public class Unity {
    private static Scanner sc = new Scanner(System.in);

    public static char readselect() {
        char c;
        for(;;) {
            String str = readkeyBoard(1);
            c=str.charAt(0);

            if(c!='1'&&c!='2'&&c!='3'&&c!='4')
            {
                System.out.println("请输入1--4之间的数字");
            }
            else
            {
                break;
            }


        }return c;
    }


    private static String readkeyBoard(int limit) {
        String str="";
        while (sc.hasNext()) {
             str = sc.nextLine();
            if(str.length()<1||str.length()>limit)
            {
                System.out.println("输入长度不符合规范，请重新输入！");
                continue;
            }

            break;


        }    return str;
    }


    public static String readString()
    {
        String str=readkeyBoard(8);


         return str;
    }

     public static int readNumber()

     {
         int n;
         for(;;)
         {
         String str=readkeyBoard(5);
         try{
             n=Integer.parseInt(str);


             break;
         }
         catch(NumberFormatException e)
         {
             System.out.println("输入错误，请重新输入！");
         }
     }
return n;

     }



     public static char readda()
     {
       char c;
       for(;;)
       {
           String str=readkeyBoard(1).toUpperCase();
           c=str.charAt(0);
           if(c!='Y'&&c!='N')
           {
               System.out.println("输入错误，请输入正确的指令！");
           }
           else
           {
               break;
           }
       }
       return c;
     }



}
