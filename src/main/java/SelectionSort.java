import java.util.Arrays;

public class SelectionSort {

    public static int[] performSelectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] expected = {1, 2, 3, 4, 5};
        int[] input = {5, 4, 3, 2, 1};
        int[] result = performSelectionSort(input);

        assert Arrays.equals(result, expected) : "Arrays not sorted correctly";
        System.out.println("Tests passed!");
    }
}
