package feb22;

import java.util.Scanner;

// Video no-7 & 8(Pepcoding)
// you are given as input marks of a student
// Display an appropriate msg based on the following rules
// for marks above 90 print excellent
// for marks above 80 and less than equal to 90 print good
// for marks above 70 and less than equal to 80 print fair
// for marks above 60 and less than equal to 70 print meets expectations
// for marks less than 60 print below par
public class Q6_ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks > 90)
		{
			System.out.println("excellent");
		}
		else if(marks > 80 && marks <= 90)
		{
			System.out.println("good");
		}
		else if(marks > 70 && marks <= 80)
		{
			System.out.println("fair");
		}
		else if(marks > 60 && marks <= 70)
		{
			System.out.println("meets expectations");
		}
		else
		{
			System.out.println("below par");
		}
	}
	
}
