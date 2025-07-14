import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter Accounter No.");
		 int a = sc.nextInt();
		 System.out.println("Enter Balance at Begining of month ");
		 int b = sc.nextInt();
		 System.out.println("Enter total of all items charged by the customer this month");
		 int i = sc.nextInt();
		 System.out.println("total credits applied to the customer’s account");
		 int c = sc.nextInt();
		 System.out.println("Enter Credit Limit ");
		 int l = sc.nextInt();
		 
		 c1.setdata(a, b, i, c, l);
		 int nb = c1.CalNbal();
		 System.out.println("New balance" + nb);
		 if( nb > l) {
			 System.out.println("Balance does not exceeds the customer's credit limit");
		 }
		 else {
			 System.out.println("Credit limit exceeded");
		 }
		 sc.close();
	}

}
