import java.awt.image.PixelGrabber;

public class Animal implements  Comparable {
    private String Dog ;
    private String Cat ;
    private String Pig ;
    private int Code ;

    public Animal(String dog, String cat, String pig,int code) {
        Dog = dog;
        Cat = cat;
        Pig = pig;
        Code = code ;

    }

    public String getDog() {
        return Dog;
    }

    public String getCat() {
        return Cat;
    }

    public String getPig() {
        return Pig;
    }
    public int getCode(){
        return Code ;
    }

    public void setDog(String dog) {
        Dog = dog;
    }

    public void setCat(String cat) {
        Cat = cat;
    }

    public void setPig(String pig) {
        Pig = pig;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Dog='" + Dog + '\'' +
                ", Cat='" + Cat + '\'' +
                ", Pig='" + Pig + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }
    public String csvFormat(){
        return this.Dog+","+this.Cat+","+this.Pig+","+this.Code ;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
