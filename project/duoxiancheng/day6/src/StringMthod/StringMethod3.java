package StringMthod;

public class StringMethod3 {


    public static void main(String[] args) {


        java.lang.String s="jdsoaon122";
       java.lang.String a= s.replace("d","n");
        System.out.println(a);
        java.lang.String b=s.replace("jds","cnm");
        System.out.println(b);
     java.lang.String c=   s.replaceAll("o","b");
        System.out.println(c);
       java.lang.String d= s.replaceAll("\\d+","");// \\d正则表达式表示数字
        System.out.println(d);
    }

}
