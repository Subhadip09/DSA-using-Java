// Video no. 27 & 28 of pepcoding
// GCD & LCM
// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
// 3. Take input "num1" and "num2" as the two numbers.
// 4. Print their GCD and LCM.

package feb22;

import java.util.*;

public class Q17_GCD_LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int orgnum1 = num1;
		int orgnum2 = num2;
		while(num1 % num2 != 0)
		{
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		
		int gcd = num2;
		int lcm = (orgnum1 * orgnum2)/gcd;
		
		System.out.println("Greatest Commom divisor of "+orgnum1+" & "+orgnum2+" is "+gcd);
		System.out.println("Lowest Commom multiplier of "+orgnum1+" & "+orgnum2+" is "+lcm);
	}
}
