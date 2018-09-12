package sort;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    private MergeSort sort = new MergeSort();

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int[] temp = new int[array.length];
        sort.sort(array, 0, 0, temp);
        Assert.assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testFiveArray() {
        int[] array = {2, 5, 1, 6, 7};
        int[] temp = new int[array.length];
        sort.sort(array, 0, array.length - 1, temp);
        Assert.assertArrayEquals(new int[]{1, 2, 5, 6, 7}, array);
    }

    @Test
    public void testEqualArray() {
        int[] array = {1, 1, 1, 1};
        int[] temp = new int[array.length];
        sort.sort(array, 0, array.length - 1, temp);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1}, array);
    }
}
