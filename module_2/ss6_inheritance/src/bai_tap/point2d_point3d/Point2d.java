package bai_tap.point2d_point3d;

public class Point2D {
    private float x ;
    private float y ;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(){

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
//        float[] arr = new float[2];
//        arr[0] = x ;
//        arr[0] = y ;
        float[] arr = {x,y};
        return arr ;

    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2d(" + x + ", " + y + ")";
    }
}
