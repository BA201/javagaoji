package thisyinhang;

public class kehu {

    public kehu(String xing, String ming)
    {
        this.xing=xing;
        this.ming=ming;
    }


    public String getXing() {
        return xing;
    }

    public void setXing(String xing) {
        this.xing = xing;
    }

    public String getMing() {
        return ming;
    }

    public void setMing(String ming) {
        this.ming = ming;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    private String xing;
  private String ming;
  private Account account;

    public static void main(String[] args) {
        Account acc=new Account(1234,2000,0.0023);
        kehu ke=new kehu("王","权利");
        ke.setAccount(acc);
        System.out.println("当前金额为"+ke.getAccount().getBalance());
        ke.getAccount().withdraw(-2);
        ke.getAccount().deposit(2555);
        System.out.println("总金额为"+ke.getAccount().getBalance());

    }





}
