package Day8Practice;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	/* readInput method is used to take inputs for m*n matrix
	 * @param arr is the first parameter
	 * @param m is the second argument which defines row
	 * @param n is the third argument which defines column
	 */
	public static void readInput(int[][] arr, int m, int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}
	/* printArray method is used to print m*n matrix
	 * @param arr is the first parameter
	 * @param m is the second argument which defines row
	 * @param n is the third argument which defines column
	 */
	public static void printArray(int[][] arr, int m, int n) {
		System.out.println("Array elements are written into output.txt file:");
		try {
      			PrintWriter output = new PrintWriter("output.txt");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
					output.print(arr[i][j]+" ");
				output.print("\n");
			}

      		
      			output.close();
    		}
    		catch(Exception e) {
      			e.getStackTrace();
			}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	//Java scanner class to take inputs
		System.out.println("Enter the values of row and columns for a M X N Array : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];	//2D array initialization
		readInput(arr,m,n);				//function call to readInput
		printArray(arr,m,n);			//function call to printArray
		sc.close();
	}

}
