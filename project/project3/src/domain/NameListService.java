package domain;

import service.TheamException;
import service.data;

import static service.data.*;

public class NameListService {

   private  Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public NameListService() {

        employees =new Employee[EMPLOYEES.length];
        for(int i=0;i<employees.length;i++)
        {
            EQUIPMENT equipment;
            int key=Integer.parseInt(EMPLOYEES[i][0]);
            int id=Integer.parseInt(EMPLOYEES[i][1]);
            String name=EMPLOYEES[i][2];
            int age=Integer.parseInt(EMPLOYEES[i][3]);
            double salary=Double.parseDouble(EMPLOYEES[i][4]);

switch (key) {
    case EMPLOYEE:
        employees[i]=new Employee(id,name,age,salary);
        break;

    case PROGRAMMER:
        equipment=createEquipment(i);
       employees[i]= new Programmer(id,name,age,salary,equipment);
       break;

    case DESIGNER:
        equipment=createEquipment(i);
        employees[i]=new Designer(id,name,age,salary,equipment,Double.parseDouble(EMPLOYEES[i][5]));
        break;

    case ARCHITECT:
        equipment=createEquipment(i);
        employees[i]=new Architect(id,name,age,salary,equipment,
                Double.parseDouble(EMPLOYEES[i][5]),Double.parseDouble(EMPLOYEES[i][6]));
            break;
}

}




        }
    private domain.EQUIPMENT createEquipment(int index) {
        int key=  Integer.parseInt(EQUIPMENT[index][0]);
        String modename=EQUIPMENT[index][1];

        switch (key)
        {
            case PC://21
            String display=EQUIPMENT[index][2];
            return new PC(modename,display);

            case NOTEBOOK://22
              double price= Double.parseDouble(EQUIPMENT[index][2]);
              return new NOTEBOOK(modename,price);

            case PRINT://23
               String type=EQUIPMENT[index][2];
               return new PRINTER(modename,type);



        }
        return null;

    }





    public Employee[] getAllEmployees()
    {
        return employees;
    }


    public Employee getEmployee(int id)
    {
        for(int i=0;i<employees.length;i++)
        {
           if(employees[i].getId()==id){return employees[i];}
        }throw new TheamException("没有找到该客户！");

    }



}
