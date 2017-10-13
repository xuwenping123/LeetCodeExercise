package easy;

/**
 * Implement strStr
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class ImplementstrStr {

	/**
	 * right but time is too long
	 * 
	 * 循环取值一一比对
	 */
    public int strStr(String haystack, String needle) {
    	char[] hayArray = haystack.toCharArray();
    	char[] needleArray = needle.toCharArray();
    	if (haystack != null && needleArray.length == 0 ) {
			return 0;
		}
		if (haystack == null || needle == null || hayArray.length == 0 || needleArray.length == 0 || hayArray.length < needleArray.length) {
			return -1;
		}
    	int tempHay;
    	int tempNeed;
    	for (int i = 0; i < hayArray.length; i++) {
    		tempHay = i;
    		tempNeed = 0;
    		while (tempHay < hayArray.length && tempNeed < needleArray.length && hayArray[tempHay] == needleArray[tempNeed]) {
    			tempHay++;
    			tempNeed++;
    		}
    		if (tempNeed == needleArray.length) {
				return i;
			}
    	}
    	return -1;
    }
    
    /**
     * 
     */
    public int strStr2(String haystack, String needle) {

    	return 0;
    }
    
    
    public static void main(String[] args) {
		ImplementstrStr str = new ImplementstrStr();
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(str.strStr(haystack, needle));
	}
}
