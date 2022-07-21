package mvcyihang;

public class Cusmtoerview {

    public  Cusmtoerview()
    {
        Cusmtoer cos=new Cusmtoer("小明",'男',18,"18639737796","123.qq.com");
        css.addCusmtoer(cos);

    }
    private Cusmtorlist css=new Cusmtorlist(10);



    public static void main(String[] args) {
        Cusmtoerview csview=new Cusmtoerview();

        boolean x=true;
        while(x)
        {
            System.out.println("--------------客户信息管理软件--------------");
            System.out.println("              1 添加客户");
            System.out.println("              2 修改客户");
            System.out.println("              3 删除客户");
            System.out.println("              4 客户列表");
            System.out.println("              5 退出");
            System.out.println("请选择你的操作（1——5）");
           char a= utility.readselect();
            switch (a)
            {
                case '1':
                    System.out.println("---------添加客户----------");
                    csview.AddNewCusmtoer();
                    break;

                case '2':
                    System.out.println("---------修改客户----------");
                    csview.xiugaiCusmtor();
                    break;

                case '3':
                    System.out.println("---------删除客户----------");
                    csview.deletekehu();
                    break;

                case '4':
                    System.out.println("---------客户列表----------");
                    csview.listAllCusmtoer();
                    break;

                case '5':
                    System.out.println("---------退出----------");
                    System.out.println("确认退出（Y/N）");
                   x= Cusmtoerview.exit();







            }

        }

    }

    public static boolean exit()
    {
       char a= utility.readda();
       if(a=='Y')
       {System.out.println("-----------退出成功----------");
           return false;}
       return true;
    }

    public  void listAllCusmtoer()
    {
       int num=css.getnum();
       if(num==0)
       {System.out.println("当前没有客户信息");return;}
       System.out.println("编号\t姓名\t性别\t年龄\t\t\t电话\t\t\t邮箱");

       Cusmtoer[] ccs=css.getCusmtor();
       for(int i=0;i<ccs.length;i++)
       {
           System.out.println((i+1)+"\t"+ccs[i].getName()+"\t"+ccs[i].getSex()+"\t"+ccs[i].getAge()+"\t\t"+ccs[i].getPhone()+"\t\t"
           +ccs[i].getEmail());
       }



    }
    public void AddNewCusmtoer()
    {
        System.out.println("请输入姓名");
       String  a=utility.readString();
        System.out.println("请输入性别");
        char b=utility.reagchar();
        System.out.println("请输入年龄");
       int c= utility.readNumber(2);
        System.out.println("请输入电话");
        String d=utility.readString();
        System.out.println("请输入邮箱");
        String e=utility.readString();

        Cusmtoer cos=new Cusmtoer(a,b,c,d,e);
      boolean z=  css.addCusmtoer(cos);
        if(z)
        {
            System.out.println("------------客户添加成功------------");
        }
        else{
            System.out.println("--------------添加失败-------------");
        }
    }

    public void xiugaiCusmtor()
    {
        int z;
        Cusmtoer sa;
        for(;;){
        System.out.println("请输入需要修改的客户编号");
       z= utility.readNumber(2);
       sa=css.getindexCusmtoer(z-1);
       if(sa==null)
       {
           continue;
       }
        else {break;}
        }
        System.out.print("姓名"+"("+sa.getName()+")");
        String  a=utility.readString(10,sa.getName());
        System.out.print("性别"+sa.getSex());
        char b=utility.reagchar(1,sa.getSex());
        System.out.print("年龄"+sa.getAge());
        int c= utility.readNumber(2,sa.getAge());
        System.out.print("电话"+sa.getPhone());
        String d=utility.readString(20,sa.getPhone());
        System.out.print("邮箱"+sa.getEmail());
        String e=utility.readString(20,sa.getEmail());
        Cusmtoer dd=new Cusmtoer(a,b,c,d,e);
        boolean zzx=css.replaceCusmtoer(z-1,dd);
        if(zzx)
        {
            System.out.println("------------修改成功-------------");
        }
        else {
            System.out.println("------------修改失败-------------");
        }


    }


    public void deletekehu()
    {
        for(;;) {
            System.out.println("请输入你要删除的客户编号");
            int a = utility.readNumber(2);
          Cusmtoer v= css.getindexCusmtoer(a-1);
          if(v==null)
          {
              System.out.println("没有找到该客户，请重新输入！");
              continue;
          }
         boolean zzz= css.deleteCusmtor(a-1);
          if(zzz)
          {
              System.out.println("-----------删除成功----------");
              return;
          }
          System.out.println("----------删除失败------------");

        }

    }





}
