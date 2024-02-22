// Video no. 21 & 22
// Question
// You've to display the digits of a number in reverse.
// Take as input "n", the number for which digits have to be display in reverse.
// Print the digits of the number line-wise, but in reverse order.
// 656787
// o/p:
// 7
// 8
// 7 
// 6
// 5
// 6

package feb22;

import java.util.*;

public class Q14_PrintDigitsInReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n!=0)
		{
			System.out.println(n%10);
			n = n/10;
		}
	}
}
