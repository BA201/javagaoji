package StringTest;
/**
 * String:字符串，使用""引起来表示。
 * String声明为final不可被继承。
 * String实现了serializable接口，表示字符串是支持序列化的。
 * 实现了comparable接口，表示是可以比较大小的。
 * String内部定义了 final char[],value用来存储字符串数据。
 * String代表不可变的字符序列。简称：不可变性。
 * 通过字面量的方式（区别于new），给一个字符串赋值，此时的字符串声明在字符串常量池中。
 * 字符串常量池中，是不会存储相同内容的字符串的。
 */

import org.junit.Test;

public class stringtest {


    @Test
    public void stringTest()
    {

        String s1="abc";//字面量的定义方式。
        String s2="abc";
        s1="hello";
        System.out.println(s1);
        System.out.println(s2);
        String s3=s1.replace("he","dc");
        System.out.println(s3);
        s3+="niubi";
        System.out.println(s3);

    }

}
