package Day8Practice;

public class Power {


	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);	//passing command line argument and converting to integer
		if(n>0 && n<31)						//Given integer must be between 0 and 31
		{
			for(int i=0;i<n;i++)
			{
				System.out.println("2^"+i+"="+Math.pow(2, i));	//printing 2 to the power i to 2 to the power n-1
			}
		}
		else {
			System.out.println("Enter number between 0 and 31");
		}
	}

}
