package mvcyihang;

public class Cusmtorlist {


    private Cusmtoer[] cusmtoer;
    private int num=0;

    public Cusmtorlist(int x)
    {
        cusmtoer=new Cusmtoer[x];
    }

    public Cusmtoer[] getCusmtoer() {
        return cusmtoer;
    }

    public void setCusmtoer(Cusmtoer[] cusmtoer) {
        this.cusmtoer = cusmtoer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public boolean addCusmtoer(Cusmtoer a)
    {
         if(num>=cusmtoer.length)
         {
             System.out.println("客户已满");
             return false;
         }
         cusmtoer[num++]=a;
         return true;
    }

    public boolean replaceCusmtoer(int index, Cusmtoer b)
    {
        if(index>=num||index<0)
        {

            System.out.println("没有找到该客户!！");
            return  false;
        }
        cusmtoer[index]=b;
        return  true;
    }

    public boolean deleteCusmtor(int index)
    {
        if(index>num-1||index<0)
        {
            System.out.println("没有找到该客户！");
            return  false;
        }
        for(int i=index;i<num-1;i++)
        {
            cusmtoer[i]=cusmtoer[i+1];
        }
        cusmtoer[--num]=null;
        return true;
    }
    public Cusmtoer[] getCusmtor()
    {
        Cusmtoer[] acc=new Cusmtoer[num];
        for(int i=0;i<num;i++)
        {
           acc[i]= cusmtoer[i];
        }
        return  acc;
    }
    public Cusmtoer getindexCusmtoer(int index)
    {
        if(index>=num||index<0)
        {
            System.out.println("没有找到该客户！");
        }
        return  cusmtoer[index];
    }

    public  int getnum()
    {
        return num;
    }

}
