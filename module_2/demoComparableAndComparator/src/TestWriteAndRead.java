import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestWriteAndRead {
    public static void writeTest(List<Animal> animalList){
        File file = new File("D:\\Codegym\\C0922G1-VanTienSy\\module_2\\demoComparableAndComparator\\src\\animal.csv");
        FileWriter fileWriter  ;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Animal eml:animalList
                 ) {
                bufferedWriter.write(eml.csvFormat());
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }
    public static List<Animal> readTest(){
        List<Animal> animalList = new ArrayList<>();
        FileReader fileReader ;
        BufferedReader bufferedReader ;
        try {
            fileReader = new FileReader("D:\\Codegym\\C0922G1-VanTienSy\\module_2\\demoComparableAndComparator\\src\\animal.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line = bufferedReader.readLine())!=null){
                String[] eml = line.split(",");
                Animal animal = new Animal(eml[0],eml[1],eml[2],Integer.parseInt(eml[3]));
                animalList.add(animal);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return animalList ;
    }
}
