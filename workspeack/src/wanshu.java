public class wanshu {


    public static void main(String[] args)
    {

        for(int i=1;i<=1000;i++)
        {
            int x=0;
            int z=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                     x+=j;
                     z=i;
                }
            }
            if(x==z)
            {
System.out.println("这个是完数"+z);
            }
        }
    }
}
