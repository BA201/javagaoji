package mvcyihang;

public class Cusmtoer {
    public  Cusmtoer(String a,char b,int c,String d,String e)
    {

        name=a;
        sex=b;
        age=c;
        Phone=d;
        email=e;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name;
    private char sex;
    private int age;
    private String Phone;
    private String email;

}
