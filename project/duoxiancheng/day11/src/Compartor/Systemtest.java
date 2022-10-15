package Compartor;

import org.junit.Test;

public class Systemtest {


    @Test

    public void ComparatorTest()

    {

       String t= System.getProperty("java.version");
        System.out.println(t);
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));


    }

}
