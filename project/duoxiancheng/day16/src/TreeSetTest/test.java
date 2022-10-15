package TreeSetTest;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class test {



    @Test

    public void test1()
    {


        Employee e1=new Employee("xiaoming",33,new MyDate(2000,9,27));
        Employee e2=new Employee("liha",96,new MyDate(1589,9,28));
        Employee e3=new Employee("liushan",88,new MyDate(1987,2,14));
        Employee e4=new Employee("wangli",33,new MyDate(2000,9,27));
        Employee e5=new Employee("zhoushi",15,new MyDate(480,96,28));


        TreeSet   set=new TreeSet(new uu());
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iter=set.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }



    }

}
