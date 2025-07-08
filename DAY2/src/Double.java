import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first double value: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: not valid double.");
            sc.close();
            return;  
        }
        double num1 = sc.nextDouble();

        System.out.print("Enter second double value: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error:  not  valid double.");
            sc.close();
            return;  
        }
        double num2 = sc.nextDouble();

        sc.close();

        double average = (num1 + num2) / 2;
        System.out.println("Average is: " + average);
    }
}
