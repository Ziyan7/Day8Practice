package Day8Practice;

import java.util.Scanner;

public class QuoRem {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the dividend:");	
		int num=sc.nextInt();						//Dividend value
		System.out.println("Enter the divisor:");
		int den=sc.nextInt();						//Divisor value
		sc.close();
		int quotient = num/den;		//To obtain quotient
		int reminder = num%den;	//to obtain reminder
		System.out.println("quotient: "+quotient);
		System.out.println("reminder: "+reminder);
	}
}
