package danlimoshi;

public class ehanshi {


    private ehanshi()
    {


    }
   private static ehanshi ss=new ehanshi();

    public static ehanshi dd()//饿汉式单例模式。
    {
        return ss ;
    }



}
