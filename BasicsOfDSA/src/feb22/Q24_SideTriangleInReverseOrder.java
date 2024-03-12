//Video no. 41 & 42 of pepcoding
// Pattern - 4
//Question
// 1.you are given a no. n
// 2.you've to create a pattern of * and separated by tab shown in o/p format

// 5
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

package feb22;

import java.util.*;

public class Q24_SideTriangleInReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n; i>=1; i--)
		{
			int space = n-i;
			for(int j = 1; j<=space; j++)
			{
				System.out.print("\t");
			}
			
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}
