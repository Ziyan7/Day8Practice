package Day8Practice;

import java.util.Scanner;

public class Quadratic {
	/* quadraticEquation method is used to compute quadratic equation
	 * @param a is the first parameter
	 * @param b is the second parameter
	 * @param c is the third parameter
	 */
	public static void quadraticEquation(double a, double b, double c) {
		double delta = (b*b)-(4*a*c);
		double x1 = (-b+Math.sqrt(delta))/(2*a);		
		double x2 = (-b-Math.sqrt(delta))/(2*a);
		System.out.println("Root1 of x is : "+x1);
		System.out.println("Root2 of x is : "+x2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three values :");
		// a,b,c are input values
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		quadraticEquation(a,b,c);
		sc.close();
	}

}