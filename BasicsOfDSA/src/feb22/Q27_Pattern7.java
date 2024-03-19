//Video no. 47 & 48 of pepcoding
// Pattern - 7
//Question
// 1.you are given a no. n
// 2.you've to create a pattern of * and separated by tab shown in o/p format
// print diagonallly
// 5
// *
//  *
//   *
//    *
//     *
package feb22;

import java.util.*;

public class Q27_Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
//			int space = i - 1;
//			for(int j = 1; j<=space; j++)
//			{
//				System.out.print("\t");
//			}
			for(int j = 1; j<=n; j++)
			{
				if(i == j)
				{
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
