//Video no. 63 & 64 of pepcoding
// Pattern - 15
//Question
// 1.you are given a no. n
// 2.you've to write code to print pattern in the given format

// A number n
// 5
//         1
//      2  3  2
//   3  4  5  4  3
//      2  3  2
//         1
package feb22;

import java.util.*;

public class Q35_pattern15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n/2;
		int star = 1;
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=space; j++)
			{
				System.out.println("\t");
			}
			
			for(int j = 1; j<=space; j++)
			{
				System.out.println("\t");
			}
			
			if(i <= n/2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
			System.out.println();
		}
	}
}
