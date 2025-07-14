import java.util.Scanner;
public class Driving_cost {

	private double miles;
	private double cost_of_gas;
	private double average;
	private double par_fees;
	private double toll;
	
	public void set_data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total miles driven per day.");
		this.miles = sc.nextDouble();
		System.out.println("Enter Cost per gallon of gasoline.");
		this.cost_of_gas = sc.nextDouble();
		System.out.println("Enter Average miles per gallon.");
		this.average = sc.nextDouble();
		System.out.println("Enter Parking fees per day.");
		this.par_fees = sc.nextDouble();
		System.out.println("Enter Tolls per day.");
		this.toll = sc.nextDouble();
		sc.close();
	}
	

	public double cal_cost() {
	    double gal = this.miles / this.average;
	    double fuelCost = gal * this.cost_of_gas;
	    return fuelCost + this.par_fees + this.toll;
	}

	
	public void displayDetails() {
	System.out.println("Total miles driven per day : "+ this.miles);
	System.out.println("Cost per gallon of gasoline. : "+ this.cost_of_gas);
	System.out.println("Average miles per gallon : "+ this.average);
	System.out.println("Parking fees per day. : "+ this.par_fees);
	System.out.println("Tolls per day : "+ this.toll);

	}
	
	public void Display_cost() {
		System.out.println("Total cost is " + cal_cost());
	}
	
	public static void main(String[] args) {
	    Driving_cost dc = new Driving_cost();
	    dc.set_data();
	    dc.displayDetails();
	    dc.Display_cost();
	
	}
}
