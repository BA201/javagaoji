package mianji;

public class text {


    public static void main(String[] args) {

        text ss=new text();
        clien dd=new clien();

         ss.tt(dd,5);
    }


    public void tt(clien c,int time)
    {
        for(int i=1;i<=time;i++)
        {
            c.radios=i;
           double z= c.mian(c.radios);
           System.out.println(c.radios+"\t"+z);
        }
    }

}
