package bai_tap.trien_khai_interface_resizeable;


public class InterfaceResizeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2]= new Square();

        System.out.println(" The area before and after resize ");
        System.out.println("Before resize");

        for (Shape shape:shapes){
            System.out.println(shape);
        }
        System.out.println("After resize");

        for (Shape shape:shapes){
            System.out.println(shape.resize());
        }

    }
}
