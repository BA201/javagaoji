package superfangfa;

public class test2 {

    public static void main(String[] args) {
        yuangong yg=new yuangong("125488",20000,0.045,5000);
        yg.quqian(1000);
        System.out.println("当前账户余额为"+yg.getblance()+"当前可透支余额为"+ yg.getTouzhi());
        yg.quqian(18000);
        System.out.println("当前账户余额为"+yg.getBlance()+"当前可透支余额为"+ yg.getTouzhi());
        yg.quqian(18000);
        System.out.println("当前账户余额为"+yg.getBlance()+"当前可透支余额为"+ yg.getTouzhi());

    }
}
