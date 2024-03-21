package string;

public class Q5_Sort_String_In_Alphabetical_order {
	public static void main(String[] args) {
		String str = "rock";
		
		char[] chArr = str.toCharArray();
		char temp;
		for(int i = 0; i<chArr.length; i++)
		{
			for(int j = i+1; j<chArr.length; j++)
			{
				if(chArr[i] > chArr[j])
				{
					temp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = temp;
				}
			}
		}
		System.out.println(new String(chArr));
	}
}
