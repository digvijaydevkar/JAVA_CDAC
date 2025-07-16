import java.util.Scanner;

public class Staff_management {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=0;
		Staff[] arr = new Staff[10];
		boolean con = true;
		while(con) {
			System.out.println("\n1.Add Teaching Staff \n2.Add Lab Staff"+
			               "\n3.Display alll Teaching Staff\n4.Display all LabStaff"
					       +"\n5.Find specific teaching Staff \n6.Fidn specific lab Staff"
			               +"\n7.Display Teaching staff who worked for highest hours"
					       +"\n8.Display lab staff who have lowest salary \n9.EXIT.....");
			
			int ch = sc.nextInt();
			
			switch(ch) {
			
			case 1 :
				if (n < arr.length) {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter noOfHours: ");
                    double noOfHr = sc.nextDouble();
                    
                    System.out.print("Enter chargesPerHour: ");
                    double charge = sc.nextDouble();
                    if (noOfHr <= 0 || charge <= 0) {
                        System.out.println("noOfHours and chargesPerHour must be > 0");
                    }
                    Teaching_Staff t = new Teaching_Staff(id, name, noOfHr, charge);
                    arr[n++] = t;
                    System.out.println("Teaching staff added .");
                    
                } else {
                System.out.println("Staff array is full!");
               }
			
            break;
							
			case 2:
                if (n < arr.length) {  
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        
                        System.out.print("Enter Name: ");
                        sc.nextLine(); 
                        String name = sc.nextLine();
                        
                        System.out.print("Enter salary: ");
                        double s = sc.nextDouble();
                        if (s <= 0) {
                           System.out.println("Salary must be > 0");
                        }
                        
                        LabStaff l = new LabStaff(id, name, s);
                        arr[n++] = l;
                        System.out.println(" staff added successfully.");
                   
                } else {
                    System.out.println(" array is full!");
                   }
                break;
				
			case 3:
				System.out.println("All Teaching Staff :");
				for (Staff s : arr) {
                    if (s instanceof Teaching_Staff)
                        System.out.println(s);
                }
				
			case 4:
				System.out.println("All LAB Staff :");
				for (Staff s : arr) {
                    if (s instanceof LabStaff)
                        System.out.println(s);
                }
				
			case 5:
				System.out.println("Enter the  staff id");
                int id = sc.nextInt();
                boolean fn = false;
                for (Staff s : arr) {
                    if (s instanceof Teaching_Staff && s.getId() == id) {
                        System.out.println(s);
                        fn = true;
                        break;
                    }
                }
                if (!fn) System.out.println(" staff not found.");
                break;
                
			case 6:
				System.out.println("Enter staff id");
                int lid = sc.nextInt();
                boolean fn1 = false;
                for (Staff s : arr) {
                    if (s instanceof LabStaff && s.getId() == lid) {
                        System.out.println(s);
                        fn = true;
                        break;
                    }
                }
                if (!fn1) System.out.println(" staff not found.");
                break;
                
                
			case 7:
				Teaching_Staff max = null;
                for (Staff s : arr) {
                    if (s instanceof Teaching_Staff) {
                        Teaching_Staff t = (Teaching_Staff) s;
                        if ( t.getNoOfHours() > max.getNoOfHours())
                            max = t;
                    }
                }
                
                if (max != null)
                    System.out.println("Teaching staff with highest hours: " + max);
                else
                    System.out.println("Not  found.");
                break;
                
                
			case 8:
				LabStaff min = null;
                for (Staff s : arr) {
                    if (s instanceof LabStaff) {
                    	LabStaff t = (LabStaff) s;
                        if ( t.getSalary() > min.getSalary())
                            min = t;
                    }
                }
                
                if (min != null)
                    System.out.println("lab staff  Lowest Salary : " + min);
                else
                    System.out.println("Not  found.");
                break;
                
                
                
			case 9:
				System.out.println("Exiting the CURRENT Application......");
				con=false;
				break;
				
			default :
				System.out.println("Invalid choice ");
                
		}
		
	 }
		sc.close();
	  
	}

}
/**/