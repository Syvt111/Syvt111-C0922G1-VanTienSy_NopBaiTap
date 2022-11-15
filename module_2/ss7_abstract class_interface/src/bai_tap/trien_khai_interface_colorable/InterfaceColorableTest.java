package bai_tap.trien_khai_interface_colorable;

import bai_tap.trien_khai_interface_resizeable.Circle;
import bai_tap.trien_khai_interface_resizeable.Rectangle;
import bai_tap.trien_khai_interface_resizeable.Shape;
import bai_tap.trien_khai_interface_resizeable.Square;

public class InterfaceColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2]= new Square();

        for (Shape shape:shapes){
            System.out.println(shape);
        }
    }



}
