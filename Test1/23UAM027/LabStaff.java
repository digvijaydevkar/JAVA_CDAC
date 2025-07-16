
public class LabStaff extends Staff{

	double salary;

	public LabStaff(int id, String nm,double salary) {
		super(id,nm);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nName: "+getName()+" ID: "+getId()+" Salary: "+getSalary();
	}


	
}
