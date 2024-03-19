//Video no. 57 & 58 of pepcoding
// Pattern - 12
//Question
// 1.you are given a no. n
// 2.you've to create a pattern of * and separated by tab shown in o/p format
// print fibonacci series
// 4

// 0
// 1 1
// 2 3 5 
// 8 13 21 34
package feb22;

import java.util.*;

public class Q32_Pattern12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0; 
		int b = 1;
		int c;
		
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(a + "\t");
				c = a+b;
				a = b;
				b = c;
			}
			System.out.println();
		}
	}
}
