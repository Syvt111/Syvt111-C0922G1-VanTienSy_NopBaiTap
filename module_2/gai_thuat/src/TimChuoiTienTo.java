public class TimChuoiTienTo {
    public static void main(String[] args) {
        String[] strs = new String[]{"abc","flow", "flower", "flight"};
        timChuoiTienTo(strs);
    }

    public static void timChuoiTienTo(String[] str) {

        String[][] strings = new String[str.length][];
        for (int i = 0; i < str.length; i++) {
            String[] strElm = str[i].split("");
            strings[i] = strElm;
        }
        int count = 0;
        for (int j = 0; j < strings[0].length; j++) {
            for (int i = 1; i < strings.length; i++) {
                if (strings[0][j].equals(strings[i][j])) {
                    count++;
                }
            }if (count == 0){
                System.out.println("Null");
                break;
            }
            else if (count == strings.length - 1) {
                System.out.print(strings[0][j]);
                count = 0;
            } else break;
        }
    }
}



