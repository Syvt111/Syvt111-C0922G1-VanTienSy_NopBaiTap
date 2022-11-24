package bai_tap.IllegalTriangleException;

public class IllegalTriangleException extends Exception {

    @Override
    public String getMessage() {
        String message = " a ,b ,c are not 3 sides of the triangle ";
        return message ;
    }
}
