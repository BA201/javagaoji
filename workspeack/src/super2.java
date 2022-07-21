public class super2 {

    public void uu() {
        System.out.println("我小明就是一个大傻逼");
    }

    public static  void main(String[] args)
    {
        ddd h=new ddd();
        h.tt();

        char[] ss=new char[]{'a','g','h'};
        System.out.println(ss);
    }



    public static class ddd extends super2{



        public  void tt()
        {
        super.uu();
        }

    }


}

