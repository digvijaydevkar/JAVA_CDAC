package com.app;
import com.app.Fruits.*;
import java.util.Scanner;

public class Basket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Basket");
		int size= sc.nextInt();
		Fruit[] basket = new Fruit[size];
		int cnt = 0;
		boolean stay=true;
		
		while(stay) {
			
			System.out.println("\n1.Exit \n2.Add Mango \n3.Add Orange \n4.Add Apple \n5.Display all names "
					+ "\n6.Display Fresh fruits \n7.Make Fruit as stale \n8.Test of stale fruits \nChoose Option : " );
			
			int ch=sc.nextInt();
			
			switch(ch) {
			 case 1:
				 stay=false;
				 break;
				 
			 case 2:
				 if(cnt<basket.length) {
					 System.out.print("Enter name: ");
                     String nm = sc.next();
                     System.out.print("Enter weight: ");
                     double wt = sc.nextDouble();
                     System.out.print("Enter color: ");
                     String col = sc.next();
                     basket[cnt++] = new Mango(nm, wt, col);
                     System.out.println("Mango added");
				 }
				 else {
					 System.out.println("Basket is full");
				 }
				 break;
				 
			 case 3:
				 if(cnt<basket.length) {
					 System.out.print("Enter name: ");
                     String nm = sc.next();
                     System.out.print("Enter weight: ");
                     double wt = sc.nextDouble();
                     System.out.print("Enter color: ");
                     String col = sc.next();
                     basket[cnt++] = new Orange(nm, wt, col);
                     System.out.println("Orange added");
				 }
				 else {
					 System.out.println("Basket is full");
				 }
				 break;
			 case 4:
				 if(cnt<basket.length) {
					 System.out.print("Enter name: ");
                     String nm = sc.next();
                     System.out.print("Enter weight: ");
                     double wt = sc.nextDouble();
                     System.out.print("Enter color: ");
                     String col = sc.next();
                     basket[cnt++] = new Apple(nm, wt, col);
                     System.out.println("Apple added");
				 }
				 else {
					 System.out.println("Basket is full");
				 }
				 break;
				 
			 case 5:
				 System.out.println("----Fruits in basket----");
				 for(Fruit f: basket) {
					 System.out.println("name : "+ f.getName());
				 }
				 break;
			 case 6: 
                 System.out.println("--- Fresh Fruits Details ---");
                 for (Fruit f : basket) {
                     if (f != null && f.isFresh())
                         System.out.println(f.toString() + ", Taste: " + f.taste());
                 }
                 break;
			 case 7:
				 System.out.print("Enter index  (0-based): ");
                 int in = sc.nextInt();
                 if (in >= 0 && in < basket.length && basket[in] != null) {
                     basket[in].setFresh(false);
                     System.out.println("Marked as stale: " + basket[in].getName());
                 } else
                     System.out.println("Invalid index");
                 break;
                 
			 case 8:
				 System.out.println("--- Tastes of Stale Fruits ---");
                 for (Fruit f : basket) {
                     if (f != null && !f.isFresh())
                         System.out.println(f.getName() + " taste: " + f.taste());
                 }
                 break;
             default:
                 System.out.println("Invalid choice!");
			}
		}
        sc.close();
        System.out.println("Thank you!");
	}
}
