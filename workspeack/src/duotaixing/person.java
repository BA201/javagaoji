package duotaixing;

public class person {
    public  void func(dongwu a)
    {
        a.eat();
        a.shout();
    }

    public static void main(String[] args) {

          person ps=new person();
          dongwu p=new laoshu();
          dongwu pp=new dog();
          if(p instanceof laoshu)
          {
              laoshu m=(laoshu) p;
              ((laoshu) p).mmin();
          }
          ps.func(new dog());
          ps.func(pp);


    }


}

class dongwu
{


    public void eat()
    {
        System.out.println("动物要吃饭");
    }

    public void shout()

    {
        System.out.println("动物会叫");
    }
}

class dog extends dongwu
{

    public void eat()
    {
        System.out.println("狗喜欢吃屎");
    }

    public void shout()

    {
        System.out.println("嘎 嘎 嘎");
    }
}

class laoshu extends dongwu
{
    public void mmin()
    {

        System.out.println("为了能够调用子类自己特有的方法，需要强制转换一下自己的类型，为了防止类型转换异常所以引用了，instanceof这个关键字。");
    }

    public void eat()
    {
        System.out.println("老鼠爱吃猫");
    }

    public void shout()

    {
        System.out.println("汪 汪 汪 ");
    }
}
