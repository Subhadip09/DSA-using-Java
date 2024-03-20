package string;

public class Q3_removeAllWhiteSpaces {
	public static void main(String[] args) {
		String  str = " ja va st a r ";
		
		String str1 = str.replaceAll("\\s", "");
		
		System.out.print(str1);
	}
}
