package dxc.dl.java;

public class lanhanmoshi {



}

class bank {
    private bank()
    {

    }
   static bank bb=null;


    public  static bank  getbb() {
        if(bb==null)
        {
        synchronized (bank.class) {//这样写效率会比较低，因为如果第一次判断后造完对象其他的线程就不用再去走一遍流程了，
            // 直接return就行了，所以为了效率高一点，可以在在同步代码块外面再加一层判断对象是否存在的语句。

            if (bb == null) {

                bb = new bank();
            }
        }

        }return bb;
    }

}