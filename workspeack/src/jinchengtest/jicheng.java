package jinchengtest;

public class jicheng {
    public  jicheng()
    {
System.out.println("wocao牛逼");
    }
    public jicheng(String name,String age)
    {
        this.name=name;
        this.age=age;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String name;
    private String age;

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    private String sfz="123";

    public static void main(String[] args) {
        jicheng ji=new jicheng("小明","33");
        ji.cat();

    }
    public void cat()
    {
        System.out.println(name+"在睡觉"+"年龄"+getAge());
    }

}
