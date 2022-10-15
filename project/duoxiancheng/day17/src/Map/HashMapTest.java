package Map;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class HashMapTest {

    @Test
    public void hashmap()
    {
        HashMap m=new HashMap();
        m.put("zhang","shabi");
        m.put("wang","li");
        m.put("li","dd");
        m.put("guo","shao");
        System.out.println(m);
        m.remove("zhang");
        System.out.println(m);
        m.put("wang","niubi");
        System.out.println(m);
        System.out.println(m.get("wang"));
        System.out.println(m.size());


        //遍历
        //Map遍历的三种方法。
        //keySet()；返回所有key构成的Set集合。然后再去遍历。
        //values();返回所有value构成的Collection集合。
        //entrySet()返回所有由key-value构成的Set集合。

        //keySet()遍历key。
        Set ke1=m.keySet();
        Iterator s=ke1.iterator();
        while(s.hasNext())
        {
            System.out.println(s.next());
        }
        System.out.println("------------------------------");

        //values()遍历value
        Collection ss= m.values();
        for( Object  t: ss)
        {
            System.out.println(t);
        }
        System.out.println("--------------------------------");
        //entrySet()遍历key-value对
        Set  sss=m.entrySet();
        for(Object r: sss)
        {
            System.out.println(r);
        }

    }

    @Test
    public void testproper() throws Exception {

        Properties ts=new Properties();
        FileInputStream file=new FileInputStream("E:\\IDEA\\project\\duoxiancheng\\jdbc.properties");
        ts.load(file);
        System.out.println(ts.getProperty("name"));
        System.out.println(ts.getProperty("password"));


    }




}
