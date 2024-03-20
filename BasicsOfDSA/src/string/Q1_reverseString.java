package string;
// i/p = "hello"
// o/p = "olleh"
import java.util.*;

public class Q1_reverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		// method 1
		char[] chArr = str.toCharArray();
		
		for(int i = chArr.length-1; i>=0; i--)
		{
			System.out.print(chArr[i]);
		}
		System.out.println();
		// method 2
		for(int i = str.length() - 1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
