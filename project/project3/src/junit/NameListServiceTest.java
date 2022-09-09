package junit;

import domain.Employee;
import domain.NameListService;
import service.TheamException;
import service.data;

public class NameListServiceTest {


    public static void main(String[] args) {

        NameListService ns=new NameListService();
       Employee[] t= ns.getAllEmployees();
for(int i=0;i<t.length;i++)
{
    System.out.println(t[i]);
}
//try{Employee s=ns.getEmployee(10);
//    System.out.println(s);}
//catch (TheamException e){
//    System.out.println(e.getMessage());
//
//}



    }

}
