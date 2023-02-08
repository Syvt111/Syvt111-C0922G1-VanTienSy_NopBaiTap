import java.util.*;

public class Test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dog = "d" ;
        String cat = "unknow" ;
        String pig = "food" ;
        int code = 2;
        Animal animal1 = new Animal(dog,cat,pig,code);
        Animal animal2 = new Animal("c","yellow","delicios",3);
        Animal animal3 = new Animal("a","black","nuong",1);
        Animal animal4 = new Animal("b","male","eat",2);
        System.out.println("input dog of information");
        String dog2 =input.nextLine();
        System.out.println("input cat of information");
        String cat2 =input.nextLine();
        System.out.println("input pig of information");
        String pig2 =input.nextLine();
        int code2 ;
        while (true){
            try {
                System.out.println("input code ");
                 code2 = Integer.parseInt(input.nextLine());
                TestNumberFortmatException.testNumber(code2);
                break;

            }catch (TestNumberFortmatException e){
                System.err.println(e.getMessage());
            }
            catch (NumberFormatException e){
                System.out.println("number not format");

            }

        }

        Animal animal5 = new Animal(dog2,cat2,pig2,code2);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);
        TestComparator testComparator = new TestComparator() ;
//       animalList.sort(Comparator.comparing(Animal::getCode));
        Collections.sort(animalList, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return 0;
            }
        });
        System.out.println(animalList);
        TestWriteAndRead.writeTest(animalList);
        System.out.println("du lieu tu file cvs");
        System.out.println(TestWriteAndRead.readTest());

    }



}
