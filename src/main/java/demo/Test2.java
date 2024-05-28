package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,1,2,3,3,4,5,5,6);
		Map<Integer, Integer> mapOfNums = new HashMap<>();
		
		for(Integer num : nums) {
			int count = 1;
			if(mapOfNums.containsKey(num)) {
				count++;
				mapOfNums.put(num, count);
				
			}else {
				mapOfNums.put(num, count);
			}
		}
		System.out.println("Map ::"+mapOfNums);

	}

}
