package jinchengtest;

public class zilei extends jicheng{
    public zilei()
    {
        super("校长","99");
    }

    public static void main(String[] args) {

        zilei zi=new zilei();
//         zi.setName("老明")
        zi.cat();

    }
 public void cat()
{
    super.cat();
    System.out.println(getName()+"是个大傻逼"+super.getSfz());
}

}
