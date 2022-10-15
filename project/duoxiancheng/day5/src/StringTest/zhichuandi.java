package StringTest;

/**
 * 面试题
 */
public class zhichuandi {

    String s=new String("good");
    char[] b={'t','e','s','k'};

public void ue(String s ,char []  b)//此形参相当将s和b的地址值，但因为String地址值是不可变得，所以结果还是good。而char[]不是不可变的，所以可以修改。
{
    s="tesk ok";
    b[0]='b';
    System.out.println(s+this.s);//tesk okgood 原因：进入方法后会在栈中创建一个临时的s变量
    // ，此s与this.s并不是同一个变量，只要除了方法{}，就会被释放，因此在方法里面的s是在栈中重新创建的，是可以被赋值的，不是常量池里的地址。
    System.out.println(b);//besk;
}
    public static void main(String[] args) {

    zhichuandi fu=new zhichuandi();
    fu.ue(fu.s,fu.b);
    System.out.println(fu.s);//good
    System.out.println(fu.b);//besk

    }


}
