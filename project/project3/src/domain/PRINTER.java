package domain;

public class PRINTER implements EQUIPMENT {
    private String name;
    private String type;

    public PRINTER(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public PRINTER() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "("+name+type+")";
    }

    @Override
    public String toString() {
        return "PRINTER{" +
               name +
               type +
                '}';
    }
}
