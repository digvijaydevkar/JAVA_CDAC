
public class Teaching_Staff extends Staff{
  
	private double noOfHours;
	private double chargesPerHour;
	

	public Teaching_Staff(int id,String nm,double noOfHours, double chargesPerHour) {
		super(id,nm);
		this.noOfHours = noOfHours;
		this.chargesPerHour = chargesPerHour;
	}


	public double getNoOfHours() {
		return noOfHours;
	}


	public void setNoOfHours(double noOfHours) {
		this.noOfHours = noOfHours;
	}


	public double getChargesPerHour() {
		return chargesPerHour;
	}


	public void setChargesPerHour(double chargesPerHour) {
		this.chargesPerHour = chargesPerHour;
	}


	public String toString() {
		return "\nName: "+getName()+"ID: "+ getId( )+"  noOfHours:-  " + noOfHours + ", chargesPerHour= " + chargesPerHour ;
	}
	
	
}
