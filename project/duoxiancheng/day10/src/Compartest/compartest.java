package Compartest;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class compartest {

    @Test
    public void comtest()
    {
        String[] s=new String[]{ "DD","II","KK","WW","BB" ,"MM","UU" };

        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

    }



    @Test
    public void comparabletest()
    {

     wang[]  wg=new wang[5];
     wg[0]=new wang("wang",66);
     wg[1]=new wang("zhang",12);
     wg[2]=new wang("li",99);
     wg[3]=new wang("quan",166);
     wg[4]=new wang("quan",99);

     Arrays.sort(wg, new Comparator<wang>() {
         @Override
         public int compare(wang o1, wang o2) {
             if(o1 instanceof wang && o2 instanceof wang)
             {
                 wang o11=(wang) o1;
                 wang o22=(wang) o2;
                 if(o11.getName().equals(o22.getName()))
                 {
                    return Double.compare(o11.getPrice(),o22.getPrice());
                 }
                 else
                 {

                     return -o11.getName().compareTo(o22.getName());
                 }

             }throw new RuntimeException("该商品类型不一致。");
         }
     });
        System.out.println(Arrays.toString(wg));


    }

}

class wang implements Comparable
{
    public  int compareTo(Object obj)
    {
        if(obj instanceof wang)
        {
            wang ocj=(wang) obj;
            if(ocj.price<this.price)
            {
                return 1;
            }
            else if(ocj.price>this.price)
            {
                return -1;
            }
            else
            {
                return -this.name.compareTo(ocj.name);
            }
        }
        return 0;
    }
    private String  name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public wang(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public wang() {
    }

    @Override
    public String toString() {
        return "wang{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }



}
