//Video no. 55 & 56 of pepcoding
// Pattern - 11
//Question
// 1.you are given a no. n
// 2.you've to create a pattern of * and separated by tab shown in o/p format

// 5
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
package feb22;

import java.util.*;

public class Q31_Pattern11_pattern_of_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int value = 1;
		
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(value + "\t");
				value++;
			}
			System.out.println();
		}
	}
}
