//Video no. 59 & 60 of pepcoding
// Pattern - 13
//Question
// 1.you are given a no. n
// 2.you've to create a pattern of * and separated by tab shown in o/p format

// 6

// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1

package feb22;

import java.util.*;

public class Q33_Pattern13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++)
		{
			int icj = 1;
			for(int j = 0; j<=i; j++)
			{
				System.out.print(icj + "\t");
				int icjp1 = (icj * (i-j)) / (j+1);
				icj = icjp1;
			}
			System.out.println();
		}
	}
}
