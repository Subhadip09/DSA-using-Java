// Video no 13 & 14
// Print all prime no. till n
// Question
// You have to print all prime numbers between a range 
// Take as input 'low' the lower limit range
// Take as input 'high' the higher limit range
// For the range print all the prime numbers between low and high (both included)
package feb22;

import java.util.*;

public class Q10_PrintAllPrimesTilln {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		for(int i=low; i<=high; i++)
		{
			int count = 0;
			for(int j = 2; j<i; j++)
			{
				if(i%j == 0)
				{
					count++;
					break;
				}
				
			}
			if(count == 0)
			{
				System.out.println(i);
			}
		}
	}
}
