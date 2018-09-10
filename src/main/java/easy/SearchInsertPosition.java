package easy;

/**
 * Given a sorted array and a target value, return the index if the target is found. 
 * 
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You may assume no duplicates in the array.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
    	int start = 0;
    	int end = nums.length - 1;
    	int pos;
    	while (start < end) {
    		pos = (start + end) / 2;
    		if (target < nums[pos]) {
				end = end - 1;
			} else if (target > nums[pos]) {
				start = pos + 1;
			} else {
				return pos;
			}
    	}
    	if (nums[start] < target) {
			start++;
		}
    	return start;
    }
    
    public static void main(String[] args) {
		SearchInsertPosition position = new SearchInsertPosition();
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		int result = position.searchInsert(nums, target);
		System.out.println(result);
	}
}
