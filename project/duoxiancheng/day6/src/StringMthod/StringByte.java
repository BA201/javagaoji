package StringMthod;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringByte {

    public static void main(String[] args) {

        String i="dsjfjsaljdd草拟吗";
        byte[] s= new byte[0];
        try {
            s = i.getBytes("gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(s));

        String b= null;

        try {
            b = new String(s,"gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(b);

        byte[] ss={32,34,90,32,93,23,99,77};
        String bb=new String(ss);
        System.out.println(bb);

    }
}
