package jinchengtest;

public class jicheng {
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

    public static void main(String[] args) {
        jicheng ji=new jicheng();
        ji.name="小明";
        ji.age="23";
        ji.cat();

    }
    public void cat()
    {
        System.out.println(name+"在睡觉");
    }

}
