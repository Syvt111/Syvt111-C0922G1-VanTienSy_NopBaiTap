package bai_tap.trien_khai_interface_resizeable;

public class Square extends Rectangle{
    public Square(){
    }

    public Square(double side){
        super(side,side);
    }
    public Square( String color, boolean filled,double side){
        super(side,side,color,filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    public void setLength(double length){
        setSide(length);
    }

    public void setWidth(double width){
        setSide(width);
    }
    public double getArea(){
        return getSide()*getSide();
    }

    @Override
    public String toString() {
        return "A Rectangle with area ="
                + getArea() ;
    }

    public double resize(){
        return getArea()*(Math.random()*(100+1)+0)/100;
    }
    public void howToColor(){
        System.out.println("Color all four sides...");

    }

}
