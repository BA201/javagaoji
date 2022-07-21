public class thisjiaohuan {

    static  int i=10;
   static  int j=30;


    public static void main(String[] args) {

        thisjiaohuan jjj=new thisjiaohuan();
        jjj.jiao(i,j);
        System.out.println(i);
        System.out.println(j);

    }


    public void  jiao(int x,int y)
    {
        int temp=x;
        i=y;
        j=temp;


    }
}
