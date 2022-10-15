import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Setface {


    @Test
    public void setTest()
    {


        HashSet hs=new HashSet();
        hs.add(123);
        hs.add("牛逼");
        hs.add(new user("小明",33));
        hs.add(new user("小明",33));

        Iterator iter = hs.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        System.out.println(hs.hashCode());


    }


}

class user
{

    String name;
    int age;

    public user() {
    }

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

}