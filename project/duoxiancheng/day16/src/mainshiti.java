import org.junit.Test;

import java.util.HashSet;
import java.util.Objects;

public class mainshiti {




    @Test
    public void test()
    {

        HashSet set=new HashSet();
        user us=new user("xiaoming",33);
        user uu=new user("hong",443);

        set.add(us);
        set.add(uu);

        us.setName("lv" );
        set.remove(us);
        System.out.println(set);//[user{name='hong', age=443}, user{name='lv', age=33}]原因:us和uu存储进底层数组后，
        // 虽然修改了他们的内容，hashcode也已发生改变，但是不会再次去修改他们的位置，意思就是位置一旦确定除非删除，否则位置不会改变，所以该位置上
        //存的是修改内容后的us，而remove删除的是修改内容后的hashcode的位置，此时会先去判断hashcode位置上是否有元素，若有则删除。

        set.add(new user("lv",33));
        System.out.println(set);//[user{name='hong', age=443}, user{name='lv', age=33}, user{name='lv', age=33}]
        //原因是此hashcode位置上的元素为空，us虽然和他hashcode相同，但是他是修改后才相同的，他仍在修改前的位置。
        set.add(new user("xiaoming",33));
        System.out.println(set);//[user{name='hong', age=443}, user{name='lv', age=33}, user{name='lv', age=33}, user{name='xiaoming', age=33}]
        //原因同上，us中内容已经修改，但是还在原来的位置，此时再添加一个修改前的us虽然位置一样，但会调用equals方法，比较内容，所以会有四个元素。


    }






}


class user
{

    String name;
    int age;

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
}
