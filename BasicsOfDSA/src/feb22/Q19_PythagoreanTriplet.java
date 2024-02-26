// Video No. 31 & 32
// Pythagorean Triplet
// You are required to check if a given set of numbers is a valid Pythagorean triplet.
// Take as input three numbers a, b and c.
// Print true if they can form a Pythagorean triplet and false otherwise.

package feb22;

import java.util.*;

public class Q19_PythagoreanTriplet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		
		if(b >= max)
		{
			max = b;
		}
		
		if(c >= max)
		{
			max = c;
		}
		
		if(max == a)
		{
			System.out.println((b*b+c*c)==(a*a));
		}
		else if(max == b)
		{
			System.out.println((a*a+c*c)==(b*b));
		}
		else
		{
			System.out.println((a*a+b*b)==(c*c));
		}
		
	}
}
