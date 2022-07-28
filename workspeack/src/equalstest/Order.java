package equalstest;

public class Order {
    private  int   id;
    private  String name;
    public Order() {
    id=88;
    name="校长";
    }

    public static void main(String[] args) {
        Order o=new Order();
        we w=new we();
//       System.out.println(o.equals(w));
       System.out.println(w);

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public boolean equals(Object object)
    {
        if(this==object)
        {return true;}
        if(object instanceof Order)
        {
            Order oo=(Order) object;
            if(this.getId()== oo.getId()&&this.getName().equals(oo.getName()))
            {
                return true;
            }
            return false;

        }
        return false;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class we extends Order{
int t;
    public we(){
        setId(12);
        setName("xao");
        t=45;

    }



}
