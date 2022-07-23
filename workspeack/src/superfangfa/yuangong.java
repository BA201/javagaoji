package superfangfa;

public class yuangong extends Account{

    public yuangong(String id,double blance,double lilv,double touzhi)
    {
        super( id, blance, lilv);
        this.touzhi=touzhi;
    }
    public double getTouzhi() {
        return touzhi;
    }

    public void setTouzhi(double touzhi) {
        this.touzhi = touzhi;
    }

    private double touzhi;



    public void quqian(double money)
    {
        if(getBlance()>=money)
        {
            setBlance(getBlance()-money);
        }
        else if(touzhi>=money-getBlance())
        {
            touzhi-=money;
            super.quqian(getblance());
        }
        else {
            System.out.println("对不起当前可透支余额不足！");
        }
    }





}
