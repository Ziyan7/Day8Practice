package Day8Practice;

public class Distance {
	/* euclideanDistance method is used to compute euclidean distance
	 * @param x is the first parameter- x coordinate value
	 * @param y is the second parameter- y coordinate value
	 */
	public static void euclideanDistance(int x, int y){
		double d=Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
		System.out.println("Distance is : "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Input from command line arguments which stores as string
		 * converting to Integer using parseInt method
		 */
		int x=Integer.parseInt(args[0]);	
		int y=Integer.parseInt(args[1]);
		euclideanDistance(x,y);		//Function call to euclideanDistance
	}

}