package Day8Practice;
import java.util.*;
public class VowelOrConsonent {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		char alph = sc.next().charAt(0);		
		//Compare alphabets with vowels
		if(alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u' || alph == 'A' || alph == 'E' || alph == 'I' || alph == 'O' || alph == 'U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}
