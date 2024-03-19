//Video no. 51 & 52 of pepcoding
// Pattern - 9
//Question
// 1.you are given a no. n
// 2.you've to create a pattern of * and separated by tab shown in o/p format

// print both diagonal
// 5
// *        *
//   *    *
//      *
//   *    *
// *        *

package feb22;

import java.util.*;

public class Q29_Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=n; j++)
			{
				if((i == j) || ((i+j) == (n+1))){
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
