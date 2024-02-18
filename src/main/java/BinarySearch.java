// BinarySearch.java

public class BinarySearch {
    public static final int ELEMENT_NOT_FOUND = -1;

    public static int performBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
    
        while (left <= right) {
            int mid = (left + right) / 2;

             if (target > nums[mid]) {
                left = mid + 1;
            }
            else if (target < nums[mid]) {
                right = mid - 1;
            }
            else {
                return mid;
            }

        }
        return ELEMENT_NOT_FOUND;
    }
}