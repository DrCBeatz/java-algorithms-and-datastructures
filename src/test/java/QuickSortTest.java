// QuickSortTest.java

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class QuickSortTest {
    static Stream<Object[]> arrayProvider() {
        // Prepare a large ArrayList for testing
        int size = 1000;
        ArrayList<Integer> largeArray = new ArrayList<>(size);
        ArrayList<Integer> largeArraySorted = new ArrayList<>(size);
        for (int i = 0; i < size; i ++) {
            largeArray.add(size - i);
            largeArraySorted.add(i + 1);
        }

        return Stream.of(
            new Object[][]{
                {toArrayList(new int[]{5, 4, 3, 2, 1}), toArrayList(new int[]{1, 2, 3, 4, 5})},
                {toArrayList(new int[]{}), toArrayList(new int[]{})},
                {toArrayList(new int[]{1, 2, 3, 4, 5}), toArrayList(new int[]{1, 2, 3, 4, 5})},
                {toArrayList(new int[]{1, 2, 4, 3, 5}), toArrayList(new int[]{1, 2, 3, 4, 5})},
                {toArrayList(new int[]{-1, -2, -3, -4, -5}), toArrayList(new int[]{-5, -4, -3, -2, -1})},
                {toArrayList(new int[]{1}), toArrayList(new int[]{1})},
                {toArrayList(new int[]{5, 4, 3, 3, 1, 2, 2, 1}), toArrayList(new int[]{1, 1, 2, 2, 3, 3, 4, 5})},
                {toArrayList(new int[]{2, 2, 2, 2, 2}), toArrayList(new int[]{2, 2, 2, 2, 2})},
                {largeArray, largeArraySorted},      

            }
        );
    }

    private static ArrayList<Integer> toArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }
        return list;
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void testQuickSortWithVariousArrays(List<Integer> nums, List<Integer> expected) {
        List<Integer> sortedNums = QuickSort.performQuickSort(nums);
        assertEquals(expected, sortedNums);
    }
}