package bai_tap.doc_file_csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateFIleCSV {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        Country country1 = new Country(1, "AU", "Australia");
        Country country2 = new Country(2, "CN", "China");
        Country country3 = new Country(3, "VN", "Vietnam");
        Country country4 = new Country(4, "CN", "China");
        Country country5 = new Country(5, "JP", "Japan");
        Country country6 = new Country(6, "CN", "China");
        Country country7 = new Country(7, "JP", "Japan");
        Country country8 = new Country(8, "TH", "Thailand");
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        countryList.add(country4);
        countryList.add(country5);
        countryList.add(country6);
        countryList.add(country7);
        countryList.add(country8);
        writeCountryFileCSV(countryList);
    }

    static final String FILE_PATH = "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\ss16_Io_texfile\\src\\bai_tap\\doc_file_csv\\country.csv";

    public static List<Country> writeCountryFileCSV(List<Country> countryList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Country list : countryList) {
                bufferedWriter.write(list.toString());
            }
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countryList;
    }
}
