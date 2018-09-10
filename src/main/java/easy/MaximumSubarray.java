package easy;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * 
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * 
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class MaximumSubarray {

	/**
	 *  Time Limit Exceeded
	 *  error
	 */
    public int maxSubArray(int[] nums) {
    	if (nums.length == 0) {
			return 0;
		}
    	int sum = nums[0];
    	for (int i = 0; i < nums.length; i++) {  // i => start
    		int temp = nums[i];
    		for (int j = 1; j <= nums.length; j++) { // j => length
    			for (int k = i + 1; k < j; k++) { // start    length
    				temp += nums[k];
    			}
    			sum = sum < temp ? temp : sum;
    			temp = nums[i];
    		}
    	}
    	return sum;
    }
    
    /**
     * not right
     * 
     * 
     */
    public int maxSubArray2(int[] nums) {
        int max = 0, sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            if (sum > max) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    
    public int maxSubArray3(int[] nums) {
    	int sum = 0, max = 0;
    	for (int i = 0; i < nums.length; i++) {
    		
    	}
    	return 0;
    }
    
    public static void main(String[] args) {
		MaximumSubarray subarray = new MaximumSubarray();
		int[] nums = { 1, 2, 3};
		int sum = subarray.maxSubArray2(nums);
		System.out.println(sum);
	}
}
