// Video No. 29 & 30
// Prime Factorization of a Number
// 1. You are required to display the prime factorization of a number.
// 2. Take as input a number n.
// 3. Print all its prime factors from smallest to largest.

package feb22;

import java.util.*;

public class Q18_PrimeFactorizationOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i*i<=n; i++)
		{
			while(n%i == 0)
			{
				n = n/i;
				System.out.print(i + " ");
			}
		}
		if(n != 1)
		{
			System.out.print(n);
		}
	}
}
