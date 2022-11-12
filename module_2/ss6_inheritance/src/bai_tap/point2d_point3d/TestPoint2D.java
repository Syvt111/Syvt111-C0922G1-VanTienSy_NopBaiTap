package bai_tap.point2d_point3d;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D);
        for (float element: point2D.getXY()
             ) {
            System.out.println(element);
        }
    }
}
