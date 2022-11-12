package thuc_hanh.he_ca_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1.0 ;

    public Circle () {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean dilled, double radius) {
        super(color, dilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI ;
    }

    public double getPerimeter() {
        return 2*getRadius()*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }


}
