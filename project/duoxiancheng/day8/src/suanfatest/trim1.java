package suanfatest;

/**
 * 计算方法：写一个方法，使得取出字符串两端的空白符号。
 */

public class trim1 {
    public static void main(String[] args) {

        trim1 t1=new trim1();
        String b="1     jdijdi   ";
        String r=t1.swap(b);
        System.out.println(r+"...");
        System.out.println(b+"...");
        System.out.println(b.trim()+"...");


    }


    public String swap(String strt)
    {
        String str=strt;
        if(!str.contains(" "))
        {
            return str;
        }

       while(true)
       {
           if(str.startsWith(" "))
           {
               str= str.replaceFirst(" ","");
           }
           else
           {
               break;
           }
       }
        char[]  s=  str.toCharArray();
        char[]  y;


         while(true)
         {
             if(str.endsWith(" "))
             {
                 int z=  str.lastIndexOf(" ");
                 y=new char[s.length-1];
                 for(int i=0;i<y.length;i++)
                 {
                     y[i]=s[i];
                 }
                 s=str.toCharArray();

                 str=new String(y);


             }
            else {
                break;
             }
         }


        return str;
    }

}
