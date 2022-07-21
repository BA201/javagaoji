package thisgouzao;

public class Girl {
    public Girl(String s)
    {
        this.name=s;
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



    public void marry(boy by)
    {
        System.out.println("我想嫁给"+by.getName());
        by.marry(this);
    }
}
