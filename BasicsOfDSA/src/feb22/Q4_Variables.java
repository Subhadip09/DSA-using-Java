package feb22;

public class Q4_Variables {
	public static void main(String[] args) {
		int x = 15;
		int y =10;
		int sum =x+y;
		System.out.println("Sum of "+ x +" and "+ y +" is " + sum);
		
		//xy
		int prd = x*y;
		System.out.println("Product of "+ x +" and "+ y +" is "+ prd);
		
		// x/y, y/x, x%y
		int v1 = x/y; //gives quotient
		int v2 = y/x;
		int v3 = x%y; //gives remainder
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		
		//exp (x*y/(x+y)) // precedence * / % > + -
		int exp = (x*y)/(x+y);
		System.out.println(exp);
	}
}
