public class digui2 {

    public static void main(String[] args) {

       int p= digui2.di(10);
        System.out.println(p);
        int ii=digui2.didi(10);
        System.out.println(ii);

    }


    public static int di(int m)
    {
        int[] x=new int[m+1];
        x[0]=1; x[1]=4;
        for(int i=2;i<=m;i++)
        {

               x[i]=2*x[i-1]+x[i-2];
        }
       return x[m];
    }


    public static int didi(int n)
    {
        if(n==0)
        {
            return 1;
        }
         else if(n==1)
        {
            return 4;
        }
         else
        {
            return 2*didi(n-1)+didi(n-2);
        }
    }

}
