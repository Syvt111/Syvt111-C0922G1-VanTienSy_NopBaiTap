package thuc_hanh.he_ca_doi_tuong_hinh_hoc;

public class Shape {
    private String color = "green";
    private boolean dilled = true ;

    public Shape(){

    }

    public Shape(String color, boolean dilled) {
        this.color = color;
        this.dilled = dilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isDilled() {
        return dilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDilled(boolean dilled) {
        this.dilled = dilled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor() + " and "
                + (isDilled()?"filled":"not filled");
    }
}

