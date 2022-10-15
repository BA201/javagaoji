package TreeSet;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class TreesetTest {



    @Test
    public void treset() {


        TreeSet ts = new TreeSet(new user());
        ts.add(new user("xiaoming", 32));
        ts.add(new user("zhangjie", 22));
        ts.add(new user("wangwei", 22));
        ts.add(new user("liuxing", 532));
        ts.add(new user("liuxing", 53));
        Iterator iter = ts.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }


    }



}

class user implements Comparable , Comparator
{

    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof user && o2 instanceof user)
        {

            user o11=(user)o1;
            user o22=(user)o2;
            if(o11.getAge()==o22.getAge())
            {
                return -o11.getName().compareTo(o22.getName());
            }
            return Integer.compare(o11.getAge(),o22.getAge());
        }
        throw new RuntimeException("类型不一致。");
    }

    @Override
    public int compareTo(Object o) {
        if(this==o)
        {
            return 0;
        }
        if(o instanceof user)
        {
            user b=(user)o;
            if(this.getName().equals(b.getName()))
            {
                return -Integer.compare(this.getAge(),b.getAge());
            }
            return -this.getName().compareTo(b.getName());
        }
        else
        {
            return -1;
        }
    }

    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public user() {
    }
}
