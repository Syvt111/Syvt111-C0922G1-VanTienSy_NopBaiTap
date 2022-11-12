package bai_tap.point2d_point3d;

public class Point3D extends Point2D {
    private float z ;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {getX(),getY(),z} ;
                return arr ;
    }
    public void setXYZ(float x,float y, float z){
        this.getX();
        this.getY();
        this.z = z ;
    }

    @Override
    public String toString() {
        return "Point3D{" + getX() + "," + getY() +"," + z +"}" ;
    }
}
