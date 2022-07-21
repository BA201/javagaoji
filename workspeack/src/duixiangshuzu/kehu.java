package duixiangshuzu;

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


}
