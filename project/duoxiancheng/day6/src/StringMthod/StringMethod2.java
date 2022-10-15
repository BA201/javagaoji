package StringMthod;
import java.lang.String;

public class StringMethod2 {


    public static void main(String[] args) {


        String s="niubi";
      boolean a=  s.endsWith("s");
        System.out.println(a);
        boolean b=s.startsWith("n");
        System.out.println(b);
        boolean c=s.startsWith("ub",2 );
        System.out.println(c);
        boolean d=s.contains("niubd");
        System.out.println(d);
        int e=s.indexOf("u");
        System.out.println(e);
        int f=s.indexOf("b",4);
        System.out.println(f);
        int g=s.lastIndexOf("i");
        System.out.println(g);
        int h=s.lastIndexOf("i",5);
        System.out.println(h);


    }

}
