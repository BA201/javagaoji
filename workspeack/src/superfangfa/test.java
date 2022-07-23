package superfangfa;

public class test {


    public static void main(String[] args) {

        Account acc=new Account("1258",20000,0.045);
        acc.quqian(400);
        System.out.println("当前余额为"+acc.getBlance());
        acc.quqian(500);
        acc.cunqian(9000);
        System.out.println("当前余额为"+acc.getBlance()+"月利率为"+acc.li()*100+"%");
    }
}
