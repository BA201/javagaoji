package duixiangshuzu;

public class ceshi {
    public static void main(String[] args) {


        yinhang yin=new yinhang();
        yin.addkehu("王","权利");
        yin.addkehu("王","权利");
        yin.indexs(0).getAccount().withdraw(200);
        yin.indexs(0).getAccount().deposit(2058.0);
        System.out.println("当前有"+yin.getNum()+"个客户");
        double x=yin.indexs(0).getAccount().getBalance();
        System.out.println("当前余额为"+x);

    }
}
