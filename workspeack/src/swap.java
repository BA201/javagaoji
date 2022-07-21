import java.io.PrintStream;

public class swap {
    public static void main(String[] args)
    {
        int m=10;
        int n=10;

        method(m,n);
        System.out.println("m="+m);
        System.out.println("n="+n);
    }
//  public static void method(int a, int b) {
//
//        PrintStream ps = new PrintStream(System.out) {
//
//
//
//            public void println(String x) {
//
//                if ("a=10".equals(x))
//
//                    x = "a=100";
//
//                else
//
//                    x = "b=200";
//
//                super.println(x);
//
//            }
//
//        };
//
//        System.setOut(ps);
//
//    }



    public static void method(int a, int b)
    {
        PrintStream ps = new PrintStream(System.out){
            public void println(String x)
            {
                if("m=10".equals(x))

                {x="m=100";}



                else  if("n=10".equals(x))  {   x="n=200";}

                super.println(x);
            }
        };
        System.setOut(ps);


    }

}
