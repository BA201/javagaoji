package Linked;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    @Test
    public void LinkedSetInit()
    {

        LinkedHashSet list=new LinkedHashSet();
        list.add("wee");
        list.add(322);
        list.add(9090);
        Iterator iter = list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

    }


}
