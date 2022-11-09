package bai_tap;


public class Fan {
    static int SLOW = 1 ;
    int MEDIUM = 2 ;
    int FAST = 3 ;
    private int speed = SLOW ;
    private boolean on = false ;
    private double radius = 5 ;
    private String color = "blue" ;

    public Fan(){

    }

    public Fan( int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public int getSpeed() {
        return speed ;
        }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan1 is on :{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}' ;
        } else {
            return "Fan2 is of :{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10,"yellow" );
        Fan fan2 = new Fan(2, false, 5 ,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
