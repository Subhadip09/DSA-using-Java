// video no. 93 & 94 of pepcoding

// You are given a no. n, representing the count of elements
// you are given n numbers
// you are required to find the span of input, span is defined as difference of max val and min val

// I/P format
// A number n
// n1
// n2
// n number of elements

// O/P format 
// A number representing max - min

// 6

// 15
// 30
// 40
// 4
// 11
// 9

// O/p : 36
package Array;

import java.util.*;

public class Q1_spanOfArray {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i<n; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		int span = max - min;
		
		System.out.println(span);
	}

}
