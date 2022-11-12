package thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        car1.carOffNumber=0;
        Car car2 = new Car("Mazda 6 ","Skyactiv 6");
        System.out.println(car1.carOffNumber+" " + car2.carOffNumber );

    }


}
