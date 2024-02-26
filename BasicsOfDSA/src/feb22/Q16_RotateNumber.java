// Video No. 25 & 26
// Rotate A Number
// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//   n = 12340056
//   k = 3
//   r = 05612340

package feb22;

import java.util.*;

public class Q16_RotateNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int k = sc.nextInt();
		
		int temp = n;
		int noOfDigits = 0;
		while(temp > 0)
		{
			temp = temp / 10;
			noOfDigits++;
		}
		
		k = k % noOfDigits;
		if(k < 0)
		{
			k = k + noOfDigits;
		}
		
		int div = 1;
		int mult = 1;
		for(int i = 1; i<=noOfDigits; i++)
		{
			if(i <= k)
			{
				div = div * 10;
			}
			else
			{
				mult = mult*10;
			}
		}
		int quo = n / div;
		int rem = n % div;
		
		int rotateNo = rem * mult + quo; 
		System.out.println(rotateNo);
	}
}
