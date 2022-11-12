package bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "John" ;
    private String classes = "C02" ;

    public  Student () {

    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

     protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

