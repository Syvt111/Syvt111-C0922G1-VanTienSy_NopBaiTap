package data.Exception;

import data.Regex.RegexTest;

public class InvalidRegexException extends Exception{
    public InvalidRegexException() {
        super("Incorrect format, please enter again !");
    }
    public static void checkServiceCode (String regex)throws InvalidRegexException{
        if ((!RegexTest.validCodeVillaService(regex))|(!RegexTest.validCodeRoomService(regex))){
            throw new InvalidRegexException();
        }
    }
    public static void checkServiceName(String regex)throws InvalidRegexException{
        if (!RegexTest.validServiceTypeStandardName(regex));
        throw new InvalidRegexException();
    }public static void checkUseArea(String regex)throws InvalidRegexException{
        if (!RegexTest.validUseArea_Pool(regex));
        throw new InvalidRegexException();
    }

}
