package view;
import java.util.Scanner;

public class utility {
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
            while (sc.hasNextLine()) {
                str = sc.nextLine();
                if(str.length()==0)
                {

                    return str;
                }
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
            String str=readkeyBoard(20);


            return str;
        }

    public static String readString(int limit, String defaultValue) {
        String str = readkeyBoard(limit);
      if(str.equals(""))
      {
          return defaultValue;
      }
      return str;
    }
        public static int readNumber(int x)

        {
            int n;
            for(;;)
            {
                String str=readkeyBoard(x);
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

    public static int readNumber(int x,int b)

    {
        int n;
        for(;;)
        {
            String str=readkeyBoard(x);
            if(str.equals(""))
            {
                str=b+"";
            }
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

        public static char reagchar()
        {
            String a=utility.readkeyBoard(1,false);
            char c=a.charAt(0);
            return c;
        }
    public static char reagchar(int x,char n)
    {

        String a=utility.readkeyBoard(x);
        if(a.equals(""))
        {
            return n;
        }
        char c=a.charAt(0);
        return c;
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



    private static String readkeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }

}








