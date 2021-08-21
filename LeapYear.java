package Day8Practice;

import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		boolean leap = false;
		if (year % 4==0) {
			if(year % 100==0) {
				if(year % 400==0) {
					leap=true;
				}
				else
					leap=false;
				
			}
			else
				leap=true;
		}
		else
			leap=false;
			
		if (leap==true)
			System.out.println("Given year "+year +" is a leap year");
		else
			System.out.println("Given year " + year +" is not a leap year");
			
			

	}

}
