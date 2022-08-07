package chouxiang;

public class test2 {

    public static void method(work s)
    {
        s.eat();
        s.shout();
    }

    public static void main(String[] args) {


     method(     new work() {
         @Override
         public void eat() {
             System.out.println("我不能呼吸");
         }

         @Override
         public void shout() {

             System.out.println("我是少时诵诗书所");

         }
     });
    }
//创建了匿名子类对象。



}



abstract  class work{

    public  abstract void eat();

    public abstract void shout();

}

