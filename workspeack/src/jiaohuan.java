public class jiaohuan {


    public static void main(String[] args) {

        int x=100;
        int z=20;
        thisjiaohuan jiao=new thisjiaohuan();
        jiao.jiao(x,z);
        System.out.println(x);
        System.out.println(z);
//        int t=jiaohuan.jiao(x,z);
//        System.out.println(t);
    }

    public static int jiao(int i,int j)
    {
        if(i==20)
        {
            return 20;
        }
         if(j==10)
        {
            return  10;
        }
        else {
        int temp=i;
        i=j;
        j=temp;


        return jiao(i,j);}

    }



}
