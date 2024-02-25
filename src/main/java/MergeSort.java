// MergeSort.java

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static List<Integer> performMergeSort(List<Integer> nums) {
        if (nums.size() > 1) {
            int mid = nums.size() / 2;
            List<Integer> L = new ArrayList<>(nums.subList(0, mid));
            List<Integer> R = new ArrayList<>(nums.subList(mid, nums.size()));
    
            performMergeSort(L);
            performMergeSort(R);
    
            int i = 0, j = 0;
    
            // Clear the list before merging the sorted halves back into it
            nums.clear();
    
            while (i < L.size() && j < R.size()) {
                if (L.get(i) < R.get(j)) {
                    nums.add(L.get(i));
                    i++;
                } else {
                    nums.add(R.get(j));
                    j++;
                }
            }
    
            // Append any remaining elements in L
            while (i < L.size()) {
                nums.add(L.get(i++));
            }
    
            // Append any remaining elements in R
            while (j < R.size()) {
                nums.add(R.get(j++));
            }
        }
        return nums;
    }
    
}
