// BinarySearchTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertEquals(BinarySearch.ELEMENT_NOT_FOUND, BinarySearch.performBinarySearch(nums, 3));
    }

    @Test
    void testSingleElementArrayFound() {
        int[] nums = {1};
        assertEquals(0, BinarySearch.performBinarySearch(nums, 1));
    }

    @Test
    void testSingleElementArrayNotFound() {
        int[] nums = {2};
        assertEquals(BinarySearch.ELEMENT_NOT_FOUND, BinarySearch.performBinarySearch(nums, 3));
    }
    
    @Test
    void testPerformBinarySearchFound() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.performBinarySearch(nums, 3));
    }

    @Test
    void testPerformBinarySearchNotFound() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(BinarySearch.ELEMENT_NOT_FOUND, BinarySearch.performBinarySearch(nums, 9));
    }

    @Test
    void testElementAtFirstPosition() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(0, BinarySearch.performBinarySearch(nums, 1));
    }

    @Test
    void testElementAtLastPosition() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(4, BinarySearch.performBinarySearch(nums, 5));
    }

    @Test
    void testLargeArray() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i;
        }
        assertEquals(500, BinarySearch.performBinarySearch(nums, 500));
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-5, -4, -3, -2, -1};
        assertEquals(2, BinarySearch.performBinarySearch(nums, -3));
    }

}
