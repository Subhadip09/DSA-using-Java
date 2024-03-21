package string;

public class Q7_Find_First_Non_Repeated_Char_in_given_String {
	public static void main(String[] args) {
		String input = "AABCDBE";
		
		for(int i = 0; i<input.length(); i++)
		{
			boolean unique = true;
			for(int j = 0; j<input.length(); j++)
			{
				if(i != j && input.charAt(i) == input.charAt(j))
				{
					unique = false;
				}
			}
			
			if(unique)
			{
				System.out.println(input.charAt(i));
				break;
			}
		}
	}
}
