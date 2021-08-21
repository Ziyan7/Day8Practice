package Day8Practice;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value:");
		int num = sc.nextInt();		              //input Harmonic value num
		sc.close();
		for(float i=1;i<=num;i++) {
			sum=sum+(1/i);			              //Computing 1/2+1/3+...1/num
		}
		System.out.println(num+ "th harmonic value is = "+sum);
	}

}