// BubbleSortTest.java

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

public class BubbleSortTest {

    static Stream<Object[]> arrayProvider() {
        // Prepare a large array for testing
        int size = 1000;
        int[] largeArray = new int[size];
        int[] largeArraySorted = new int[size];
        for (int i = 0; i < size; i++) {
            largeArray[i] = size - i; // Fill in reverse order
            largeArraySorted[i] = i + 1; // Expected sorted order
        }

        return Stream.of(
                new Object[][]{
                        // Test case: Standard unsorted array
                        {new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}},
                        // Test case: Empty array
                        {new int[]{}, new int[]{}},
                        // Test case: Already sorted array
                        {new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}},
                        // Test case: Partially sorted array
                        {new int[]{1, 2, 4, 3, 5}, new int[]{1, 2, 3, 4, 5}},
                        // Test case: Array with negative numbers
                        {new int[]{-1, -2, -3, -4, -5}, new int[]{-5, -4, -3, -2, -1}},
                        // Test case: Single element array
                        {new int[]{1}, new int[]{1}},
                        // Test case: Array with duplicates
                        {new int[]{5, 4, 3, 3, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 3, 3, 4, 5}},
                        // Test case: Array where all elements are identical
                        {new int[]{2, 2, 2, 2, 2}, new int[]{2, 2, 2, 2, 2}},
                        // Test case: Large array (e.g., 1000 elements)
                        {largeArray, largeArraySorted},
                }
        );
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void testBubbleSortWithVariousArrays(int[] nums, int[] expected) {
        BubbleSort.performBubbleSort(nums);
        assertArrayEquals(expected, nums);
    }
}
