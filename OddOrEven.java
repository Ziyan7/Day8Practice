package Day8Practice;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();	
		sc.close();
		if(num%2 == 0)			//dividing the value by 2 gives the remainder 0 or 1, if the reminder is 0 then even else odd
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}