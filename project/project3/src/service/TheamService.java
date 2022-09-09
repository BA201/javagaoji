package service;


import domain.*;

public class TheamService {

    private  int counter=1;//就是memberid；
    private  final   int MAX_MERBER=5;
    private Programmer[] team =new Programmer[MAX_MERBER];//保存开发团队成员
    private  int total;//团队中的实际开发人数。
    public int  getTotal()
    {
        return total;

    }

    public TheamService() {
    }

    public Programmer[] getTeam()
    {
        Programmer[] team=new Programmer[total];
    for(int i=0;i<team.length;i++)
    {
        team[i]=this.team[i];

    }
        return  team;
    }

    public void addmerber(Programmer e)
    {

      if(total>=MAX_MERBER)
      { throw new TheamException("该团队成员已满");}
      if(e instanceof Programmer==false)
      {
         throw new TheamException("该成员不是开发人员");
      }

      if(isExec(e))
      {throw new TheamException("该成员已在团队，无法添加！");}
        Programmer ee=(Programmer)e;
        if(ee.getStatus().getName().equals("BUSY"))
        {
            throw new TheamException("该成员已在其他团队中！");
        }
        else
            if(ee.getStatus().getName().equals("VOCATION"))
            {
                throw new TheamException("该员工正在休假！");
            }
        int a=0;//用来记录团队中架构师的数量
        int b=0;//用来记录团队中设计师的数量
        int c=0;//用来记录团队中程序员的数量
        for(int i=0;i<total;i++) {
            if (e instanceof Architect) {
                a++;
            } else if (e instanceof Designer) {
                b++;
            } else if (e instanceof Programmer)
            {
                c++;
            }
        }
             if(e instanceof Architect )
             if(a>=1)
             {
                 throw new TheamException("该团队中架构师人数已经够了，你可以滚了。");
             }
             else if(e instanceof Designer)
             if(b>=2)
             {
               throw new TheamException("团队中设计师数量已经有两名了。");
             }
             else if(e instanceof  Programmer)
             if(c>=3)
             {
                 throw new TheamException("团队中已经有了三明程序员了。");
             }
             team[total++]=e;
             e.setStatus(Status.BUSY);
             e.setMemberId(counter++);


    }


    private boolean isExec(Employee e) {

        for(int i=0;i<total;i++)
        {
            if(e.getId()==team[i].getId())
            {
                return true;
            }

        }

        return false;

    }

    public void removemerver(int memberid)
    {
        int i;
      laa:  for( i=0;i<total;i++)
        {
            if(team[i].getMemberId()==memberid)
            {
                team[i].setMemberId(0);
                team[i].setStatus(Status.FREE);
                for (int j=i+1;j<total;j++)
                {
                    team[j-1]=team[j];



                }
                //其实可以不用设置，只要下一次再加入就会直接重新赋值。
                team[--total]=null;
                return;
            }
        }
        if(i==total){
            throw new TheamException("没有找到该成员，请重新输入！");}

    }
}
