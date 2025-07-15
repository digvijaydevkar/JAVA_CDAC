
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = sc.nextLine();
         
		StringBuilder stb = new StringBuilder(st);
		
		
		stb.reverse();
		
		String s = stb.toString();
		
		if(s.equals(st)) System.out.println("Given String is PALINDROME:  ");
		else System.out.println("Given String is NOT PALINDROME:  ");
		
		
//		boolean b = false;
//		for(int i=0,j=a.length-1;i<j;i++,j--) {
//			 if(a[i] == a[j]) b = true;
//			abcd else {
//				 b = false;
//				 break;
//			 }
//	     }
//		
//	     if(b) {
//		     System.out.println("Given String is PALINDROME:  "+st);
//	     }
//	     else {
//		   System.out.println("Given String is NOT PALINDROME:  "+st);
//	     }

		 
	     sc.close();
	}
}
