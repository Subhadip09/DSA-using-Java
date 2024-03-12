//Video no. 45 & 46 of pepcoding
// Pattern - 6
//Question
// 1.you are given a no. n
// 2.you've to create a pattern of * and separated by tab shown in o/p format

// 5  // rows 5 column 7
// * * *   * * *  // 3 star 1 space 3 star
// * *       * *
// *           *
// * *       * *
// * * *   * * *

package feb22;

import java.util.*;

public class Q26_Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int star = (n/2) + 1;
		int space = 1;
		
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=star; j++)
			{
				System.out.print("*\t");
			}
			
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
				star = star - 1;
				space = space + 2;
			}
			else
			{
				star = star + 1;
				space = space - 2;
			}
			System.out.println();
		}
	}
}
