
package string;

public class Q4_Remove_duplicate_characters {
	public static void main(String[] args) {
		String str = "Programming";
		
		char[] chArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<chArr.length; i++)
		{
			boolean repeated = false;
			for(int j = i+1; j<chArr.length; j++)
			{
				if(chArr[i] == chArr[j])
				{
					repeated = true;
					break;
				}
			}
			if(!repeated)
			{
				sb.append(chArr[i]);
			}
		}
		System.out.println(sb);
	}
}
