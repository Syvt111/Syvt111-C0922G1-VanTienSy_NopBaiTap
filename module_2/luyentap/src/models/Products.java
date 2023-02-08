package models;

public abstract class Products {
    private String id ;
    private String version ;
    private String color ;

    public Products(){

    }

    public Products(String id, String version, String color) {
        this.id = id;
        this.version = version;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    public String getColor() {
        return color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
