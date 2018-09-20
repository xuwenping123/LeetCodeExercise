package medium;

public class ContainerWithMostWater {

    /**
     * 使用枚举法，遍历过程中有效剔除
     * O(n * n)
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int temp;
        int value = 0;
        for (int i = 0; i < height.length - 1; i++) {
            temp = (height.length - 1 - i) *
                    (height[i] < height[height.length - 1] ? height[i] : height[height.length - 1]);
            value = temp > value ? temp : value;
            for (int j = height.length - 1; j > i + 1; j--) {
                if (height[j] < height[j - 1]) {
                    temp = height[i] < height[j - 1] ? height[i] : height[j - 1];
                    temp = (j - 1 - i) * temp;
                    value = temp > value ? temp : value;
                }
            }
        }
        return value;
    }

    /**
     * 使用贪心算法
     * O(n)
     * @param height
     * @return
     */
    public int maxArea2(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int value = 0;
        while (start < end) {
            value = Math.max(value, (end - start) * Math.min(height[start], height[end]));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return value;
    }
}
