//Video no. 43 & 44 of pepcoding
// Pattern - 5
//Question
// 1.you are given a no. n
// 2.you've to create a pattern of * and separated by tab shown in o/p format

// 5
//     *
//   * * * 
// * * * * *
//   * * *
//     *

package feb22;

import java.util.*;

public class Q25_DiamondPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n/2;
		int star = 1;
		
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=space; j++)
			{
				System.out.print("\t");
			}
			
			for(int j = 1; j<=star; j++)
			{
				System.out.print("*\t");
			}
			
			if(i <= n/2)
			{
				space--;
				star = star + 2;
			}
			else
			{
				space++;
				star = star - 2;
			}
			System.out.println();
		}
	}
}
