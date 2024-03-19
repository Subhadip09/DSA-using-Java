//Video no. 53 & 54 of pepcoding
// Pattern - 10
//Question
// 1.you are given a no. n
// 2.you've to create a pattern of * and separated by tab shown in o/p format

// 5
//      *
//    *   *
//  *       *
//    *   *
//      *

package feb22;

import java.util.*;

public class Q30_Pattern10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int outerSpace = n/2;
		int innerSpace = -1;
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=outerSpace; j++)
			{
				System.out.print("\t");
			}
			
			System.out.print("*\t");
			
			for(int j = 1; j<=innerSpace; j++)
			{
				System.out.print("\t");
			}
			
			if(i > 1 && i<n)
			{
				System.out.print("*\t");
			}
				
			if(i <= n/2)
			{
				outerSpace--;
				innerSpace+=2;
			}
			else {
				outerSpace++;
				innerSpace-=2;
			}
			System.out.println();
		}
	}
}
