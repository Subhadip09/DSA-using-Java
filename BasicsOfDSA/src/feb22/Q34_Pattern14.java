//Video no. 61 & 62 of pepcoding
// Pattern - 14
//Question
// 1.you are given a no. n
// 2.you've to write code to print it's multiplication table upto 10 in the given format

// A number x

// x * 1 = x
// x * 2 = 2x
// x * 3 = 3x
// x * 4 = 4x
// x * 5 = 5x
// .
// .
// .

// 2
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// 2 * 4 = 8
// 2 * 5 = 10
// .
// .
// .
// 2 * 10 = 20
package feb22;

import java.util.*;

public class Q34_Pattern14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i = 1; i<=10; i++)
		{
			System.out.println(x + " * " + i + " = " + (x*i));
		}
	}
}
