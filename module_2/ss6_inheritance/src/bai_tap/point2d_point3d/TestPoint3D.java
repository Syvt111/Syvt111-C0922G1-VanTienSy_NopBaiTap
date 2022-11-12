package bai_tap.point2d_point3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);
        for (float element: point3D.getXYZ()
             ) {
            System.out.println(element);

        }
    }
}
