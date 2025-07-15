import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = sc.nextLine();
        StringBuilder stb = new StringBuilder(st);
		
		stb.reverse();
		
		String s = stb.toString();
		
		System.out.println("Resversed String :"+s);
		
		
//		for(int i=0,j=r.length-1;i<j;i++,j--) {
//
//           char temp=r[i];
//           r[i]=r[j];
//           r[j]=temp;
//           
//		}
//		
//		System.out.println("Reverse String: ");
//		for(int i=0;i<r.length;i++) {
//			System.out.print(r[i]);
//		}
		
		
		sc.close();
	}

}
