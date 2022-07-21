package fengzhuang;

public class bin {
    public bin()
    {
     height= 10;
  width=10;
      double xx=  ji(height,width);
        System.out.println("面积是"+xx);
    }
    public bin(int o,char i)
    {
       setWidth(i);
        setHeight(o);

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int height;
    private int width;

    private double ji(int a,int b)
    {
      double x= 0.5*a*b;
        return x;
    }


}
