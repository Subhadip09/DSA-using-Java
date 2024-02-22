// Video no. 15 & 16
// Question
// You've to print first n fibonacci numbers
// Take as input 'n' the count of fibonacci numbers to print
// Print first n fibonacci numbers
package feb22;

import java.util.*;

public class Q11_FibonacciTillN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc. nextInt();
		int a = 0;
		int b = 1;
		for(int i = 0; i<n; i++)
		{
			System.out.println(a);
			int c = a+b;
			a = b;
			b = c;
		}
	}
	
}
