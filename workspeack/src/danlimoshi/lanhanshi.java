package danlimoshi;

public class lanhanshi {

    private lanhanshi()
    {

    }

    private static lanhanshi ss=null;

    public  static  lanhanshi dd()//懒汉式单例模式
    {
        if (ss==null)
        {
        ss=new lanhanshi();
        }
        return ss;
    }

}
