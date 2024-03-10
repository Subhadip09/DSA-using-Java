/*
video 3 & 4 of pepcoding
print
 *****
    *
   *
  *
 *****
*/
//package feb22;

//public class Q3_PrintZ {
//	public static void main(String[] args)
//    {
//        System.out.println("*****");
//        System.out.println("   *");
//        System.out.println("  *");
//        System.out.println(" *");
//        System.out.println("*****");
//
//    }
//}
package feb22;

import java.util.*;

public class Q3_PrintZ{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{	
			for(int j = 1; j<=n; j++)
			{
				if(i == 1 || i == n || i+j == (n+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}