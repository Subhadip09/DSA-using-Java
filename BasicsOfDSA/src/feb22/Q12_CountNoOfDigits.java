// Video no 17 & 18
// Question
// Count No of digits in a number
// You've to count number of digits in a number
// Take as input 'n' the number for which the digits has to be counted
// Print the digits in that number
package feb22;

import java.util.*;

public class Q12_CountNoOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int digits = 0;
		while(n!=0)
		{
			n =n/10;
			digits++;
		}
		System.out.println(digits);
	}
}
