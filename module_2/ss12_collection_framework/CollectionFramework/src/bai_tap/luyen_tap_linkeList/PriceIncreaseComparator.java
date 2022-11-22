package bai_tap.luyen_tap_arrayList_LinkeList;

import java.util.Comparator;

public class PriceIncreaseComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getPrice()-product2.getPrice()>0){
            return 1;
        } else if (product1.getPrice()-product2.getPrice()==0) {
            return 0;
        }else return -1 ;
    }
}
