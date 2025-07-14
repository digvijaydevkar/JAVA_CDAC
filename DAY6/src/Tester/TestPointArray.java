package Tester;

import com.app.geometry.Point2d;
import java.util.Scanner;

public class TestPointArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of points");
        int n = sc.nextInt();
        Point2d[] pts= new Point2d[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter points for x and y co-ordinates for point: " + (i + 1));
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            pts[i] = new Point2d();     
            pts[i].setdata(x, y);        
        }
        
        boolean ex=true;
        while(ex) {
        System.out.println("\n1.Display details of a specific point \n2.Display x, y co-ordinates of all points "
        		+ "\n3. validate the indices \n4.Exit");
        
        int ch=sc.nextInt();
        
        switch(ch) {
           
        case 1:
        	    System.out.println("Enter the index of specific point");
        	    int in = sc.nextInt();
        	    if(in>=0 && in<n) {
        	    	    System.out.println(pts[in].getdetails());
        	    }
        	    else {
        	    	  System.out.println("Invalid index , pls retry ");
        	    }
        	    break;
        	    
        case 2 :
        	   System.out.println("X anf Y coordinates of all points");
        	   int i=0;
        	   for(Point2d p : pts) {
        		   System.out.println("Point: "+ (++i) + p);
        	   }
        	   break;
        	   
        case 3:
        	    System.out.println("Enter the index of start point n end point");
        	    int a = sc.nextInt();
        	    int b=  sc.nextInt();
        	    if(a >= 0 && a < n && b >= 0 && b < n) System.out.println("Invalid Index");
        	    if(pts[a].isEqual(pts[b])) {
        	    	   System.out.println("Two Points are Equal");
        	    }
        	    else {
        	    	System.out.println("Distance betweeen two points is "+ pts[a].caldis(pts[b]));
        	    }
        	    break;
        	    
        case 4:
        	    System.out.println("Thank You.................");
        	    ex=false;
        	    break;
        	    
         }
      }
        sc.close();
   }
}
