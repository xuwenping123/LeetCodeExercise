package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Integer
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {

	/**
	 * 类比
	 * @param s
	 * @return
	 */
    public int romanToInt(String s) {
    	char[] array = s.toCharArray();
    	int first = 0, second;
    	int value = 0;

    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);

    	for (int i = 0; i < array.length; i++) {
    		second = map.get(array[i]);
    		if (first < second && (first == 1 || first == 10 || first == 100)) {
				value -= first;
			} else {
				value += first;
			}
    		first = second;
    	}
    	value += first;
    	return value;
    }

}
