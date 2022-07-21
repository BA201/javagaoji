package fengzhuang;

public class ppp {
    private int age;
    private String name;

    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return  this.age;
    }
    public ppp(){
        age=18;
    }

    public  ppp(int a,String b)
    {
        age=a;
        name=b;
    }

    public static void main(String[] args) {

        ppp pp=new ppp(12,"小明");
        pp.setAge(43);
        System.out.println(pp.age);
    }

}
