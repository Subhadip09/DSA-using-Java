// Video no. 19 & 20
// Question
// You've to display the digits of a number.
// Take as input "n", the number for which digits have to be displayed.
// Print the digits of the number line-wise from left to right.
// 754
// o/p: 
// 7
// 5
// 4

package feb22;

import java.util.*;

public class Q13_PrintDigitsOfNumberLeftToRight {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int noOfDigits = 0;
		int temp =n;
		while(temp!=0)
		{
			temp = temp/10;
			noOfDigits++;
		}
		
		int div = (int)Math.pow(10, noOfDigits -1);
		while(div != 0)
		{
			int q = n/div;
			System.out.println(q);
			
			n = n%div;
			div = div/10;
		}
	}
}
