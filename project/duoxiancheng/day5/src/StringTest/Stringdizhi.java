package StringTest;

public class Stringdizhi {

    public static void main(String[] args) {

Person p1=new Person("小明","吃屎");
Person p2=new Person("小明","吃屎");

System.out.println(p1.name==p2.name);//true;因为他们虽然创建了两个对象，但是他们的name属性都是通过字面量赋值的，
// 所以他们的value都是指向同一个常量池中的地址值的，因此他们的地址是一样的。
        String p4="小明";
        System.out.println(p1.name==p4);//true;




    }

}

class Person
{

    public String name;
     public String ai;

    public Person(String name, String ai) {
        this.name = name;//使用字面量赋值。
        this.ai = ai;
    }
}