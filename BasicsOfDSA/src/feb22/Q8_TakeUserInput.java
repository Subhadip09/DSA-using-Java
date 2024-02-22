package feb22;

import java.util.*;
// how to take input from user
// video no. 10
public class Q8_TakeUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// to take int type of value from user
//		int n = sc.nextInt();
//		
//		for(int i=0; i<=n; i++)
//		{
//			System.out.println(i);
//		}
//		
//		// to take String type of value from user
//		String name = sc.nextLine();
//		System.out.println("Hello " + name);
		
		
		// to take String & int at a time from user
		int n = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		
		System.out.println("Dear "+ name +". Here is the counting " );
		for(int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}
