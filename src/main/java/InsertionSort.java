// InsertionSort.java

public class InsertionSort {
    public static int[] performInsertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && key < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] expected = {1, 2, 3, 4, 5};
        int[] input = {5, 4, 3, 2, 1};
        int[] result = performInsertionSort(input);
        assert result == expected;
        System.out.println("Tests passed!");
    }
}