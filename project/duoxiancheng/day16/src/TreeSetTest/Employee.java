package TreeSetTest;

import java.util.Comparator;

public class Employee implements Comparable {





    @Override
    public int compareTo(Object o) {
        if(o instanceof  Employee)
        {
            Employee b=(Employee) o;
            return this.getName().compareTo(b.getName());
        }
        throw new RuntimeException("类型不匹配");
    }

    private String name;
    private int age;
    private MyDate MySb;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", MySb=" + MySb +
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

    public MyDate getMySb() {
        return MySb;
    }

    public void setMySb(MyDate mySb) {
        MySb = mySb;
    }

    public Employee(String name, int age, MyDate mySb) {
        this.name = name;
        this.age = age;
        MySb = mySb;
    }

    public Employee() {
    }
}
//按照出生日期排序。
class uu implements  Comparator
{

    @Override
    public int compare(Object o1, Object o2) {

        if(o1 instanceof Employee&& o2 instanceof Employee)
        {
            Employee oo1=(Employee) o1;
            Employee oo2=(Employee) o2;
            int minus=oo1.getAge()-oo2.getAge();


            if(minus!=0)
            {
                return minus;
            }
            int monthminus=oo1.getMySb().getMonth()-oo2.getMySb().getMonth();
            if(monthminus!=0)
            {

                return monthminus;
            }
            int minusday= oo1.getMySb().getDay()-oo2.getMySb().getDay();
if(minusday!=0)
{return minusday;

}
return  oo1.getName().compareTo(oo2.getName())  ;



        }
        throw  new RuntimeException("类型不匹配");

    }
}