package StringMthod;

/**
 * 判断一个字符串再领一个字符串中出现的次数。
 */

public class Stringindexcishu {
    public static void main(String[] args) {
        String h="hfljsjljhfjlasjfjhfljll";
        Stringindexcishu ss=new Stringindexcishu();
       int z= ss.indexx("f",h);
        System.out.println(z);

    }


    public int indexx(String a, String b)
    {
        String bb=b;
        int x=0;
        if(bb.contains(a))
        {

  while(true)
  {
    int s= bb.indexOf(a);
    if(s>=0)
    {
        x+=1;
      bb=bb.substring(s+a.length());

    }
    else {
        break;
    }

  }
        }
        else {
            return x;
        }
        return x;


    }



}
