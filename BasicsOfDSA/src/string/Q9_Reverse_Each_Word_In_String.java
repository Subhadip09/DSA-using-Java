package string;

public class Q9_Reverse_Each_Word_In_String {
	public static void main(String[] args) {
		String input = "java code";
		System.out.println("original string :: "+input);
		
		String output = "";
		String[] words = input.split(" ");
		
		for(String word : words)
		{
			String revWord = "";
			
			for(int i = word.length()-1; i>=0; i--)
			{
				revWord = revWord + word.charAt(i);
			}
			output = output + revWord + " ";
		}
		System.out.println("Reverse String :: "+output);
	}
}
