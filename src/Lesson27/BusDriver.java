package Lesson27;

public class BusDriver {
    private final int id;
    private static int idCounter =100;
    private  String name;
    private String license;


    public BusDriver( String name, String license) {
        this.id = idCounter++;
        this.name = name;
        this.license = license;
    }

    public  String toString(){
        StringBuilder sb = new StringBuilder("BusDriver: {");
        sb.append("id: ").append(id);
        sb.append(", name").append(name);
        sb.append("}");
        return sb.toString();


    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
