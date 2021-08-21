package Day8Practice;


import java.util.Scanner;

public class SumOfInteger {
	/* sumZero method is used to sum of three integers which adds to zero
	 * @param arr is the first parameter and its an array
	 * @param n is the second argument which defines number of elements
	 */
	public static void sumZero(int[] arr, int n) {
		boolean found = false;
		int count = 0;
		for(int i=0; i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;j<n;j++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						count++;
						System.out.println("Triplets are "+arr[i]+","+arr[j]+","+arr[k]);
						found = true;
					}
					
					
				}
			}
		}
		if(found==false) {
			System.out.println("No triplets found");
		}
		System.out.println("Total triplet pairs : "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int num = sc.nextInt();
		int[] a = new int[num];		//initializing an array with size num
		System.out.println("Enter the elements of the array :");
		for(int i=0;i<num;i++) {	// iterating until the num-1, to take input from the terminal
			a[i]=sc.nextInt();
		}
		sumZero(a,num);			//function call to sumZero
		sc.close();
	}

}