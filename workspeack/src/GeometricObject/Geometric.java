package GeometricObject;


public class Geometric {


    public static void main(String[] args) {

        circle c=new circle(11.0,"dijf",3);
        circle cc=new circle(10.0,"dij",3);
        System.out.println(c.equals(cc));
        System.out.println(c.getColor().equals(cc.getColor()));

    }



    private String color;
    private double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Geometric()
    {
 color="white";
 weight=1.0;
    }

    public Geometric(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
}
class circle extends Geometric{
    public boolean equals(Object anObject)
    {
        if(this==anObject)
            return true;
        if(anObject instanceof circle)
        {
            circle oo=(circle) anObject;
            return  radius==oo.radius;
        }
        return false;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;
public  circle()
{
super();
radius=1.0;
}

public  circle(double radius)
{
    super();
    this.radius=radius;
}

public circle (double radius,String color,double weight)
{

    super(color ,weight);
    this.radius=radius;
}
    public double findarea()
    {
        return  3.14*radius*radius;
    }




}