package chouxiangfangfa;

public class cx {


}

abstract class ww {

    public abstract void eat();

}

class  ee extends ww{



    public void  eat()
    {}//重写了抽象方法，此时该类就不是抽象类了，所以可以实例化。

}

abstract  class qq extends ww{

    //或者在子类里面用abstract修饰。
}


