package bai_tap.ValidatePhoneNumber;

public class PhoneNameTest {
    static ValidPhoneNumber phoneNumbers = new ValidPhoneNumber();
    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)","(84)-(0962223310)","(84)-(0971444990)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)","(84)-(097b48964a)","(84)-(09784896489)"};

    public static void main(String[] args) {
        for (String phoneNumber : validPhoneNumber) {
            boolean isNumber = phoneNumbers.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is validate : " + isNumber);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isNumber = phoneNumbers.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is validate : " + isNumber);
        }
    }
}
