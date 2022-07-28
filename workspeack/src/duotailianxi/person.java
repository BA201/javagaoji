package duotailianxi;

public class person {
    public static void main(String[] args) {

        person p=new person();
        Persons pp=new graduate();
        p.method(new student());
        p.method(pp);

    }




    public void method(Persons a)
    {
        String b=a.getinfo();
        System.out.println(b);
        if(a instanceof graduate )
        {
            System.out.println("我的职业是老板");
        }
        else
            if(a instanceof student)
            {
                System.out.println("学生");
            }
            else if(a instanceof Persons)
            {
                System.out.println("我是父类");
            }
    }

}


class Persons {
    protected String name="小明";
    protected int age=22;

    public String getinfo(){
        return "name"+name +"\n"+"age"+age;
    }

}

 class student extends Persons {
    protected String school="光明小学";
    public String getinfo(){
        return "name"+name +"\n"+"age"+age+"\n"+school;
    }

}

class graduate extends Persons {
    protected String major="老师";
    public String getinfo(){
        return "name"+name +"\n"+"age"+age+"\n"+major;
    }
}





