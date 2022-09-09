package service;

public class Status {
private final  String name;

    public String getName() {
        return name;
    }



    private Status(String name) {
        this.name=name;
    }

    public static final Status FREE=new Status("FREE");
    public static final Status BUSY=new Status("BUSY");
    public static final Status VOCATION=new Status("VOCATION") ;

    @Override
    public String toString() {
        return "Status{" +
                "name='" + name + '\'' +
                '}';
    }
}
