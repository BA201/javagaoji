package StringTest;

public class zifuchuanlianjie {


    public static void main(String[] args) {


        String s1="java";
        String s2="hadoop";
        String s6="javahadoop";
        String s3=s1+"hadoop";
        String s4="java"+s2;
        String s5="java"+"hadoop";
        System.out.println(s3==s6);//false
        String s7=s3.intern();
        System.out.println(s6==s7);//true使用intern方法返回值就会直接在常量池中的地址。

    }

}
