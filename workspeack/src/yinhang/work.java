package yinhang;

public class work {


    public static void main(String [] args)
    {
        boolean x=true;
        int numm=10000;
        String deast="收支     账户金额     收支金额     说   明\n";

        while(x)
        {
            System.out.println("---------------家庭收支记账软件---------------");
            System.out.println("                 1收支明细");
            System.out.println("                 2登记收入");
            System.out.println("                 3登记支出");
            System.out.println("                 4退   出");
            System.out.println("                 请选择1~4");
             char d= Unity.readselect();
            switch(d)
            {
                case '1':
                    System.out.println("----------当前收支明细----------");
                    System.out.println(deast);

                    System.out.println("-------------------------------------------");
                    break;
                case '2':
                    System.out.println("----------登记收入----------");
                    System.out.println("本次收入金额:");
                    int money=Unity.readNumber();
                    System.out.println("收入说明:");
                    String sm=Unity.readString();
                    numm+=money;
                    deast+=("收入"+"     "+numm+"      "+money+"         "+sm+"\n");
                    System.out.println("---------------登记成功---------------");
                    break;
                case '3':
                    System.out.println("----------3登记支出----------");
                    System.out.println("本次支出金额:");
                    int zhi=Unity.readNumber();
                    System.out.println("支出说明:");
                    String chu=Unity.readString();
                    if(numm>=zhi){
                    numm-=zhi;}
                    else{
                        System.out.println("余额已不足！");
                    }
                    deast+=("支出"+"     "+numm+"      "+zhi+"         "+chu+"\n");
                    System.out.println("---------------登记成功---------------");
                    break;
                case '4':
//                    System.out.println("----------4退    出----------");
                    System.out.println("确认是否退出（Y/N）");
                    char e= Unity.readda();
                    if(e=='Y')
                    {
                        x=false;
                        System.out.println("已退出！");
                    }

                    break;
            }

        }
    }

}
