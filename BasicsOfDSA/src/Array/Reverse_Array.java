package Array;

import java.util.*;

public class Reverse_Array {
	
	public static void reverseArray(int[] arr, int n)
	{
		int[] reverse = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			reverse[i] = arr[n-i-1];
		}
		
		for(int i : reverse)
		{
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("reverse Array: ");
		reverseArray(arr, n);
	}
}
