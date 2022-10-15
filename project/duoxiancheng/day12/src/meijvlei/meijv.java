package meijvlei;

import org.junit.Test;

import java.util.Arrays;

public class meijv {


    @Test
    public void test1()
    {
        siji[] g= siji.values();
        System.out.println(Arrays.toString(g));
        System.out.println(siji.valueOf("chuntian"));
        siji h=siji.xiatian;
        h.xinxi();
    }

    @Test

    public void meijvtest()
    {

      Season s=  Season.chuntian;
        System.out.println(s.getName());
        System.out.println(s);
        siji b=siji.chuntian;
        System.out.println(b.getClass().getSuperclass());

    }


}

//自定义枚举类
class Season
{
    private final String  name;
    private final String  desc;
//私有化构造器，并给对象赋值。
    private Season(String name,String desc)
    {
        this.name=name;
        this.desc=desc;
    }
//提供当前枚举类的对个对象。记得是public静态的，不然调不了。
    static public Season chuntian=new Season("春天","春暖花开");
    static public Season xiatian=new Season("夏天","烈日炎炎");
    static public Season qiutian=new Season("春天","秋风萧瑟");
    static public Season dongtian=new Season("春天","大雪纷飞");

//若想查看属性可以提供get方法。


    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


//使用enum关键字定义枚举类

interface info
{

    void xinxi();
}

enum siji implements info
{

    //1:提供当前枚举类的对象，多个对象之间用“,”隔开，结尾用“;”结束。相同的修饰符必须省略。
    chuntian("春天","春暖花开"){public void xinxi(){
        System.out.println("春天不回来");
    }},
    xiatian("夏天","艳阳高照"){public void xinxi(){
        System.out.println("宁静的夏天");
    }},
    qiutian("秋天","秋高气爽"){public void xinxi(){
        System.out.println("就让秋风带走我的眼泪");
    }},
    dongtian("冬天","满山遍雪"){public void xinxi(){
        System.out.println("冬天的愿望");
    }};

    //2:声明siji类的属性，此时修饰符要留着。
    private final String name;
    private final String desc;
    //3 提供构造器并赋值。
    private siji(String name ,String desc)
    {
        this.name = name;
        this.desc = desc;
    }



        }


