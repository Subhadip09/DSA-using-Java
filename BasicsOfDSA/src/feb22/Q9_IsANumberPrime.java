// video no. 11 & 12 of pepcoding
// Question
// You have to check whether a given no is prime or not
// Take a no. 'T' as input representing count of input numbers to be tested
// Take a number 'n' as input 'T' number of times
// For each input value of n print 'prime' if the no is prime and 'not prime' otherwise.
package feb22;

import java.util.*;

public class Q9_IsANumberPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0; i<t; i++)
		{
			int n = sc.nextInt();
			
			int count = 0;
			for(int j = 2 ; j*j<n; j++)
			{
				if(n%j==0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("non-prime");
			}
		}
	}
}
