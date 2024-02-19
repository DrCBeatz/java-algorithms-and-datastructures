// BubbleSort.java

public class BubbleSort {
    public static int[] performBubbleSort(int[] nums) {
        int length = nums.length - 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (nums[j+1] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;
    }
}
