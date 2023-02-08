public class TestNumberFortmatException extends Exception{
    public TestNumberFortmatException() {
        super("Input not number format");
    }
    public static void testNumber(int number) throws TestNumberFortmatException {
        if (number<10){
            throw new TestNumberFortmatException();
        }
    }
}
