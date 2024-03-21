// video no 99 & 100
// Input
// 5 ->   3 1 0 7 5 
// 6 -> 1 1 1 1 1 1
// Output
// 1 4 2 1 8 6
package Array;

import java.util.*;

public class Q4_sum_of_two_arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		
		for(int i = 0; i<n1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		
		for(int i = 0; i<n2; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int[] sum = new int[n1 > n2? n1 : n2];
		int carry = 0;
		
		int i = n1 - 1;
		int j = n2 - 1;
		int k = sum.length - 1;
		
		while(k >= 0)
		{
			int digit = carry;
			
			if(i >= 0)
			{
				digit += arr1[i];
			}
			
			if(j >= 0)
			{
				digit += arr2[j];
			}
			
			carry = digit/10;
			digit = digit%10;
			
			sum[k] = digit;
			
			i--;
			j--;
			k--;
		}
		if(carry != 0)
		{
			System.out.println(carry);
		}
		
		for(int val : sum)
		{
			System.out.println(val);
		}
	}
}
