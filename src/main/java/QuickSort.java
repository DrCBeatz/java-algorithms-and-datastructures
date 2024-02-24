// QuickSort.java

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static List<Integer> performQuickSort(List<Integer> nums) {
        if (nums.size() <= 1) {
            return nums;
        }

        int pivot = nums.get(nums.size() - 1);

        List<Integer> larger = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> smaller = new ArrayList<>();
        
        for (int n : nums) {
            if (n > pivot) {
                larger.add(n);
            }
            else if (n < pivot) {
                smaller.add(n);
            }
            else {
                equal.add(n);
            }

        }

        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(performQuickSort(smaller));
        sorted.addAll(equal);
        sorted.addAll(performQuickSort(larger));
        return sorted;
    }
    
}
