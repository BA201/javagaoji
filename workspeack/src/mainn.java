public class mainn {

    public mainn()
    {
        System.out.println("我是构造器");
    }
    String name="小红";
    int age=32;
    static  String ss="我是一个人" ;

    public static void main(String[] args) {
//        String s=mainn.ss;
        mainn ss=new mainn();

    }

static {
System.out.println("静态代码块随着类的加载而加载");


}//静态代码块

    {
System.out.println("我曹牛逼");
    }//非静态代码块


}
