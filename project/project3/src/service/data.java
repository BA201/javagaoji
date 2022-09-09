package service;

public class data {

    public static final int EMPLOYEE=10;
    public static final int PROGRAMMER=11;
    public static final int DESIGNER=12;
    public static final int ARCHITECT=13;

    public static final int PC=21;
    public static final int NOTEBOOK=22;
    public static final int PRINT=23;


    /**
     *employee:10 id name  age  salary;
     * programmer 11 id mame age  salary;
     * designer 12 id name age salary  bonus;
     * architect 13 id name age salary bonus stock;
     *
     */

    public static final String[][] EMPLOYEES=
    {

        {"10","01","马 云","53","3000"},
        {"13","02","马化腾","56","8999","2500","410"},
        {"11","03","李彦宏","32","3222"},
        {"11","04","刘强东","56","6999"},
        {"12","05","雷 军","48","6980","1200"},
        {"11","06","任志强","33","7893"},
        {"12","07","柳传志","67","4563","7890"},
        {"13","08","杨元庆","88","8787","987","798"},
        {"12","09","史玉柱","45","332","3223"},
        {"11","10","丁 磊","32","2332"},
        {"11","11","张朝阳","55","3532"},
        {"12","12","杨志远","32","4222","708"},


    };
    /**
     * 设备与上面的人员一一对应。
     * PC 21 model display
     * NOTEBOOK  22 mode price
     * PRINTER 23 name type
     */

    public static final String[][] EQUIPMENT={


            {},
            {"22","联想T4","6000"},
            {"21","戴尔","NEC17寸"},
            {"21","戴尔","三星17寸"},
            {"23","佳能29000","激光"},
            {"21","华硕","三星17寸"},
            {"21","华硕","三星17寸"},
            {"23","爱普生20k","针式"},
            {"22","惠普m6","5800"},
            {"21","戴尔","NEC 17寸"},
            {"21","华硕","三星 17寸"},
            {"22","惠普m6","5800"}


    };





}
