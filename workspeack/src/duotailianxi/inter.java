package duotailianxi;

public class inter {
    public static void main(String[] args) {
ppp s=new pp();

personss ss=(personss) s;
pp sss=(pp)ss;
System.out.println(((pp) ss).c);



    }
}

class personss{

    int a=10;

}

class  ppp extends personss
{
    int b=20;
}

class pp extends ppp{

    int c=30;
}
