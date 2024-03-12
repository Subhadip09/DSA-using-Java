//Video no. 35 & 36

//Question
// 1.you are given a no. n
// 2.you've to create a pattern and separated by tab shown in o/p format
// 5
// *
// * *
// * * *
// * * * *
// * * * * *
package feb22;

import java.util.*;

public class Q21_SideTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
