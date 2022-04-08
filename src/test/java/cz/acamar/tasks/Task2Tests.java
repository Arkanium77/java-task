package cz.acamar.tasks;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task2Tests {

    private final Task2 task2 = new Task2();

    @Test
    void test_case1() {
        int[] input = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case2() {
        int[] input = new int[]{-7, -3, 2, 3, 11};
        int[] expected = new int[]{4, 9, 9, 49, 121};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case3() {
        int[] input = new int[]{};
        int[] expected = new int[]{};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case4() {
        // Running this test on my system takes ~0.1 s.
        int[] input = IntStream.range(1, 1000000).map(i -> 1111).toArray();
        int[] expected = IntStream.range(1, 1000000).map(i -> 1234321).toArray();

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

}
