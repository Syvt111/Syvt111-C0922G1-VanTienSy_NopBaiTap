package bai_tap.CircleClass_CylinderClass;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getRadius()*getRadius()*height*Math.PI;
    }

    public String toString(){
        return "A Cylinder with radius = " + getRadius()
                + " color is " + getColor() + " and height = " + getHeight()
                + " has volume = " + getVolume();
    }


}
