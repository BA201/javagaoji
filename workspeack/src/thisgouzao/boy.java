package thisgouzao;

public class boy {

    public boy(int a, String b)
    {
        this.age=a;
        this.name=b;
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

    private String name;
    private int age;


    public void marry (Girl girl)
    {
        System.out.println("我想娶"+girl.getName());
    }

    public void shout()
    {
        if(this.age>22)
        {
            System.out.println("你可以去登记结婚了");
        }
        else
        {
            System.out.println("滚去写作业");
        }
    }


}
