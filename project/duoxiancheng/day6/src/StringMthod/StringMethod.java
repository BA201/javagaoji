package StringMthod;
import java.lang.String;

public class StringMethod {

    public static void main(String[] args) {
        java.lang.String a="      niusdjflds";
        int s=a.length();
        System.out.println(s);
      java.lang.String b=  a.toUpperCase();
        System.out.println(b);
        String c=b.toLowerCase();
        System.out.println(c);
       boolean d= c.isEmpty();
        System.out.println(d);
        String e=a.trim();
        System.out.println(e);
       boolean f= a.equals(c);
        System.out.println(f);
       boolean g= a.equals(b);
        System.out.println(g);
       boolean h= a.equalsIgnoreCase(b);
        System.out.println(h);
        String i=a.concat("王权利");
        System.out.println(i);
       String j= a.substring(8);
        System.out.println(j);
        String k=a.substring(7,10);
        System.out.println(k);


    }

}
