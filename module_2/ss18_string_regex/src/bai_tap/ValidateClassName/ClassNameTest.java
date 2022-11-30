package bai_tap.ValidateClassName;

public class ClassNameTest {
    public static ValidateClassName className = new ValidateClassName();
    public static final String[] validClassName = new String[]{"C0318G", "A0212H"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        for (String name : validClassName){
            boolean isvalid = className.validate(name);
            System.out.println("Class name is " + name + "is valid: " + isvalid);
        }
        for (String name : invalidClassName){
            boolean isvalid = className.validate(name);
            System.out.println("Class name is " + name + "is valid: " + isvalid);
        }
    }
}
