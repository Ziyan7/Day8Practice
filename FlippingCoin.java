package Day8Practice;
import java.util.*;
public class FlippingCoin {
	
	
	

	public static void main(String[] args) {
		//variable
		Double head=0.00 , tail =0.00 ; int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of time to flip the coin");
		//Input
		int n=sc.nextInt();
		sc.close();
		//To obtain random values
		Random rand =new Random();
		for (i=0;i<=n;i++) {
			float choice= rand.nextFloat();
			if (choice<0.5)
				tail++;
			else
				head++;
		}
		System.out.println("percentage of head :"+(head/n)*100+"%");
		System.out.println("percentage of tail:"+(tail/n)*100+"%");
	}

}
