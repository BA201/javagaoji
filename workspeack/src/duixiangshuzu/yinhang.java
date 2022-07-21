package duixiangshuzu;

public class yinhang {
    public yinhang()
    {
        acc=new kehu[10];
    }


    public kehu[] getAcc() {
        return acc;
    }

    public void setAcc(kehu[] acc) {
        this.acc = acc;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private  kehu[] acc;
    private int num;

    public void addkehu(String f,String l)
    {
        Account ass=new Account(2000);
        kehu ax=new kehu(f,l);
        acc[num++]=ax;
        ax.setAccount(ass);
    }

public int huoqu()//返回当前客户人数
{
    return  num;
}
public kehu indexs(int a)//获取客户
{
    return acc[a];
}

}
