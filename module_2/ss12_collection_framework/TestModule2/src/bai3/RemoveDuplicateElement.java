package bai3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] array = {7, 5, 3, 9, 1, 10, 9, 4, 9};
        int[] result = removeDuplicateElement(array);
        for (int element : result
        ) {
            System.out.print(element + "  ");
        }
    }

    public static int[] removeDuplicateElement(int[] arr) {
        Set<Integer> list = new LinkedHashSet<>();
        for (int j : arr) {
            list.add(j);
        }
        int[] result = new int[list.size()];
        int n = 0;
        for (Integer number : list
        ) {
            result[n] = number;
            n++;
        }
        {

        }

        return result;
    }
}
