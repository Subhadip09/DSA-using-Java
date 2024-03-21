package string;

import java.util.HashMap;
import java.util.Map;

public class Q8_Find_Occurance_of_each_Character_in_String {
	public static void main(String[] args) {
		String str = "hello";
		
		Map<Character, Integer> map = new HashMap();
		char[] chars = str.toCharArray();
		
		for(char ch : chars)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else {
				int value = map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
	}
}
