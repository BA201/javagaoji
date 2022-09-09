package service;

import domain.Employee;
import domain.NameListService;
import domain.Programmer;
import view.utility;

import java.util.Scanner;

public class teamView {



     private  NameListService listSvc=new NameListService();
     private  TheamService    teamSvc=new TheamService();
     private void enterMainMenu()
     {
         boolean t=true;

        while(t)
         {
             System.out.println("-------------------------------------------开发团队调度软件-------------------------------------------------");
             System.out.println("ID"+"\t\t"+"姓名"+"\t\t"+"年龄"+"\t\t"+"工资"+"\t\t"+"职位"+"\t\t"+"状态"+"\t\t\t"+"奖金"+"\t\t"+"股票"+"\t\t"+"领用设备");
             for(int i=0;i<listSvc.getEmployees().length;i++)
             {
             System.out.println(listSvc.getAllEmployees()[i]);
             }

             System.out.println("--------------------------------------------------------------------------------------------------------");
             System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出");
             char xuan=utility.readselect();

             switch(xuan)
             {

                 case '1':
                     System.out.println("----------------------------------------团队列表---------------------------------------------");
                     System.out.println("TID/ID"+"\t"+"姓名"+"\t\t"+"年龄"+"\t\t"+"工资"+"\t\t"+"职位"+"\t\t"+"奖金"+"\t\t"+"股票");
                        getTeam();
                break;

                 case '2':
                     System.out.println("----------------------添加团队成员-----------------");
                     System.out.println("请输入要添加的员工ID");
                     int o=utility.readNumber(3);
                     addMember(o);
                 break;

                 case '3':
                     System.out.println("------------------------删除团队成员-----------------");
                     System.out.println("请输入要删除的成员的memberid");
                     int u=utility.readNumber(3);
                     deleteMember(u);
                 break;
                 case '4':
                     System.out.println("--------------------退出客户端--------------------");
                     System.out.println("按Y或N退出");
                   char s= utility.readda();//输入的y或n无论是大写还是小写都会转化为大写
                    t= exit(s);


             }


         }

     }

    private boolean exit(char s) {
         if(s=='Y')
         {
             return false;
         }
         return true;
    }

    private Programmer[] listAllEmployee()
     {
         if(listSvc.getAllEmployees()==null)
         {
                    throw new TheamException("该公司中没有成员！");
         }

        return listAllEmployee();
     }//已列表形式列出公司所有成员

     private void getTeam()
     {
         if(teamSvc.getTeam()==null||teamSvc.getTotal()==0)
         {
System.out.println("该团队中还没有添加任何程序员！");
         }
         else
         {


             for(int i=0;i< teamSvc.getTotal();i++)
             {
                 System.out.println(teamSvc.getTeam()[i].stringto());
             }
         }

     }//显示团队成员列表操作
    private void addMember(int e)
    {
      Employee ss= listSvc.getEmployee(e);
      if(ss==null)
      {
          System.out.println("没有找到该成员！");
      }
      else
      if(ss instanceof Programmer)
      {
          Programmer si=(Programmer) ss;
          teamSvc.addmerber(si);
          System.out.println("-----------------添加成功---------------");
      }


    }//实现添加成员操作
    private void deleteMember(int memid)
    {
Employee  idd=listSvc.getEmployee(memid);
if(idd==null)
{
System.out.println("没有找到该成员");
}
else
{
teamSvc.removemerver(memid);
System.out.println("---------------------删除成功------------------");
}


    }//实现删除成员操作


    public static void main(String[] args) {

    teamView tv=new teamView();
    tv.enterMainMenu();


    }


}
