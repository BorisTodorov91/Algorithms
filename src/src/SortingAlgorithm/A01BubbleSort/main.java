package SortingAlgorithm.A01BubbleSort;

import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        BubbleSort ob = new BubbleSort();
        int [] arr = {5, 1, 4, 2, 8 };
        ob.sort(arr);
        System.out.println("Sorted");
        ob.print(arr);

        TreeSet<String> stringTreeSet = new TreeSet<>();
    }
}
