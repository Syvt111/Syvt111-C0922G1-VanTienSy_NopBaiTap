

public class TestComparator implements java.util.Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
//        if ((o1.getCode()>o2.getCode())){
//            return 1 ;
//            }
//        else if (o1.getCode()<o2.getCode()){
//            return -1 ;
//        }else
//        return 0 ;
        int compare = o1.getCode()- o2.getCode();
        if (compare!= 0){
            return compare ;
        }else
        return o1.getDog().compareTo(o2.getDog());
    }
}