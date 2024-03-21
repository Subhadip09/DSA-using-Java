// video no 95 & 96
// 6

// 15
// 30
// 40
// 4
// 11
// 9

// 40

// O/p: 2



package Array;
import java.util.*;
public class Q2_Find_IndexOfElement_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int fElement = sc.nextInt();
		int index = -1;
		for(int i = 0; i<n ; i++)
		{
			if(arr[i] == fElement)
			{
				index = i;
				break;
			}
			
		}
		System.out.println(index);
	}
}
