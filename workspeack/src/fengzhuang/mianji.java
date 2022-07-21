package fengzhuang;
//构造器的使用
public class mianji {
    public static void main(String[] args) {


        bin vv=new bin( 1,'a');
        mianji mian =new mianji();
       double x= mianji.jiji(vv.getHeight(),vv.getWidth());
        System.out.println("面积是"+x);



    }
    public static double jiji(int a,int b)
    {
        return  0.5*a*b;
    }
}
