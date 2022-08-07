package chouxiangtest2;

public class Mydata {
    public Mydata(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toDataStirng()
    {
        return year+"年"+month+"月"+day+"日";
    }
}
