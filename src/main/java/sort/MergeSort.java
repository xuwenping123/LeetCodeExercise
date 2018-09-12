package sort;

/**
 * 归并排序
 */
public class MergeSort {

    /**
     * 归并排序
     * 分
     * @param array
     * @param left
     * @param right
     * @param temp
     */
    public void sort(int[] array, int left, int right, int[] temp) {
        if (right <= left) {
            return;
        }
        int mid = (left + right) / 2;
        if (left <= mid) {
            sort(array, left, mid, temp);
            sort(array, mid + 1, right, temp);
            merge(array, left, mid, right, temp);
        }
    }

    /**
     * 归并排序
     * 和
     * @param array
     * @param left
     * @param mid
     * @param right
     * @param temp
     */
    private void merge(int[] array, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        while(i < j && i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            }
            if (array[i] > array[j]) {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }
        k = 0;
        while(left <= right) {
            array[left++] = temp[k++];
        }
    }
}
