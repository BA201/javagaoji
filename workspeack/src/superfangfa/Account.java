package superfangfa;

public class Account {
    public Account()
    {

    }

    public Account(String id,double blance,double lilv)
    {
        this.id=id;
        this.blance=blance;
        this.lilv=lilv;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public double getLilv() {
        return lilv;
    }

    public void setLilv(double lilv) {
        this.lilv = lilv;
    }

    private String id;
    private double blance;
    private double lilv;



    public void quqian(double money)
    {
        if(blance>=money)
        {
            setBlance(getBlance()-money);
        }
    }

    public void cunqian(double money)
    {
        setBlance(getBlance()+money);
    }

    public double getblance()
    {
        return getBlance();

    }
    public double  li()
    {
        return lilv/12;
    }


}
