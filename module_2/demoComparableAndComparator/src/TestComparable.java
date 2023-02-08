import java.util.Comparator;

public class TestComparable implements Comparable<Animal> {

    @Override
    public int compareTo(Animal o) {
        return o.getCode();
    }
}
