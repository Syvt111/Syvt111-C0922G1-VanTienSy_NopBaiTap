package Exception;

import services.IFacilityService;

public class InvalidRegexException extends Exception{
    public InvalidRegexException() {
        super("Incorrect format, please enter again !");
    }
    public static void checkVillaServiceCode(String regex)throws InvalidRegexException {
        if ((!IFacilityService.RegexTest.validCodeVillaService(regex))) {
            throw new InvalidRegexException();
        }
    }
        public static void checkRoomServiceCode(String regex) throws InvalidRegexException{
        if (!IFacilityService.RegexTest.validCodeRoomService(regex)){
            throw new InvalidRegexException();
        }
    }
    public static void checkServiceName(String regex) throws InvalidRegexException{
        if (!IFacilityService.RegexTest.validServiceTypeStandardName(regex)){
        throw new InvalidRegexException();
        }
    }public static void checkUseArea(String regex)throws InvalidRegexException {
        if (!IFacilityService.RegexTest.validUseArea_Pool(regex)) {
            throw new InvalidRegexException();
        }
    }

}

