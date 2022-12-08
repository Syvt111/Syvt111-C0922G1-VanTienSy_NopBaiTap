package services;

import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface IFacilityService {
    void displayListFacility(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList);

    void addNewFacility(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList);

    void displayListFacilityMaintenance(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList);

    void returnMainMenu(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList);

    class RegexTest {
        private static Pattern pattern ;
        private static Matcher matcher ;


        public RegexTest() {

        }
        public static boolean validCodeVillaService(String regex){
            final String CODE_SERVICE = "^[SVVL]+[-]+[0-9]{4}$";
            pattern = Pattern.compile(CODE_SERVICE);
            matcher = pattern.matcher(regex);
            return matcher.matches();

        }  public static boolean validCodeRoomService(String regex){
            final String CODE_SERVICE = "^[SVRO]+[-]+[0-9]{4}$";
            pattern = Pattern.compile(CODE_SERVICE);
            matcher = pattern.matcher(regex);
            return matcher.matches();

        }
        public static boolean validServiceTypeStandardName(String regex){
           final String SERVICE_NAME = "^[A-Z][a-z]+";
           Pattern newPattern = Pattern.compile(SERVICE_NAME);
           Matcher newMatcher = newPattern.matcher(regex);
           return newMatcher.matches();

        }
        public static boolean validPrice(String regex){
            pattern = Pattern.compile("[1-9]+[0-9]");
            matcher =pattern.matcher(regex);
            return !matcher.matches();
        }
        public static boolean validMaxPeople(String regex){
            pattern = Pattern.compile("^([1-9]|1[0-9])$|(^[0-1][0-9]$)");
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }
        public static boolean validUseArea_Pool(String regex){
            final String USE_ARE = "(^[3-9]+[0-9])|(^[1-9]+[0-9]+[0-9])";
            pattern = Pattern.compile(USE_ARE);
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }
        public static boolean validNumbersOfFloor(String regex){
            pattern = Pattern.compile("(^[1-9])|(^[0-9]+[1-9])|(^[1-9]+[0-9])");
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }

        public static boolean validBirthday(String regex){
            final String BIRTHDAY = "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
            pattern =Pattern.compile(BIRTHDAY);
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }

    }
}
