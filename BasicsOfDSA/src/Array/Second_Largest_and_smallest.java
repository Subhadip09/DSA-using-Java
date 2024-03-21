package Array;

import java.util.*;

public class Second_Largest_and_smallest {
	public static int SecondLargest(int[] arr, int n)
	{
		int[] arr1 = new int[n];
		
		int large = arr[0];
		int secondLarge = -1;
		for(int i = 0; i<n; i++)
		{
			if(arr[i] > large)
			{
				secondLarge = large;
				large = arr[i];
			}
			else if(arr[i] < large && arr[i] > secondLarge)
			{
				secondLarge = arr[i];
			}
		}
		return secondLarge;
	}
	
	public static int SecondSmallest(int[] arr,  int n)
	{
		int[] arr1 = new int[n];
		
		int small = arr[0];
		int secondSmall = Integer.MAX_VALUE;
		
		for(int i =0; i<n; i++)
		{
			if(arr[i] < small)
			{
				secondSmall = small;
				small = arr[i];
			}
			else if(arr[i] > small && arr[i] < secondSmall)
			{
				secondSmall = arr[i];
			}
		}
		return secondSmall;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Second Largest element is: " + SecondLargest(arr, n));
		System.out.println("Second Smallest element is: " + SecondSmallest(arr, n));
	}
}
