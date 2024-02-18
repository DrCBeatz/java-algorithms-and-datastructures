public class BinarySearch {
    public static final int ELEMENT_NOT_FOUND = -1;
    static int performBinarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
    
        while (l <= r) {
            int mid = (l + r) / 2;
             if (target > nums[mid]) {
                l = mid + 1;
            }
            else if (target < nums[mid]) {
                r = mid - 1;
            }
            else {
                return mid;
            }

        }
        return (ELEMENT_NOT_FOUND);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        
        try {
            assert performBinarySearch(nums, 3) == 2;
            assert performBinarySearch(nums, 9) == ELEMENT_NOT_FOUND;
            System.out.println("Tests passed!");
        }
         catch (AssertionError e) {
            System.out.println("A test failed");
         }

    }
}