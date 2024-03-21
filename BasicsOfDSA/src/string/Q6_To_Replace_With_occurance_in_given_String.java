package string;

public class Q6_To_Replace_With_occurance_in_given_String {
	public static void main(String[] args) {
		String input = "opentext";
		char charToReplace = 't';
		
		// check char present in String or not
		if(input.indexOf(charToReplace) == -1)
		{
			System.out.println("Given character is not available in input string");
			System.exit(0);
		}
		
		// logic to replace character occurance in string
		int count = 1;
		for(int i = 0;i<input.length(); i++)
		{
			char ch = input.charAt(i);
			if(ch == charToReplace)
			{
				input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count++;
			}
		}
		System.out.println(input);
	}
}
