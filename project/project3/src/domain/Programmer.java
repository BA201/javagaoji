package domain;
import service.Status;

public class Programmer extends Employee {


    private int memberId;//开发团队中的id
    private Status status=Status.FREE;
    private EQUIPMENT equipment;
    private String zhi="程序员";

    public Programmer() {
    }

    public String shebei()
    {
        return status.getName() ;
    }

    public String tostring1(){
        return
                 equipment+"" ;
    }

    public String stringto1()
    {
        return
       memberId+"/"+ getId() +"\t\t"+
                getName() +"\t"+ getAge() +"\t\t"+ getSalary()+"\t"
        ;
    }
    public  String stringto()
    {
        return stringto1()+zhi;
    }

    public String toString() {
        return tostring()+zhi+"\t"+shebei()+"\t\t\t\t\t\t"+tostring1();
    }

    public Programmer(int id, String name, int age, double salary, EQUIPMENT equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public EQUIPMENT getEquipment() {
        return equipment;
    }

    public void setEquipment(EQUIPMENT equipment) {
        this.equipment = equipment;
    }
}
