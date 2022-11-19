import java.util.TreeMap;

public class CountWordOccurrence {
    public static String[] splitString(String string) {
        return string.toUpperCase().split(" ");
    }

    public static void main(String[] args) {
        String string = "Sy Sy Van Code Gym";
        TreeMap<String, Integer> map = new TreeMap<>();
        int count = 0;
        for (int i = 0; i < splitString(string).length; i++) {
            if (map.containsKey(splitString(string)[i])) {
                count++;
                map.put(splitString(string)[i], count);
            } else {
                count = 1;
                map.put(splitString(string)[i], count);
            }
        }
        System.out.println(map);
//        for (String key : map.keySet()) {
//            Integer value = map.get(key);
//            System.out.println(key + " : " + value);
//        }
    }
}
