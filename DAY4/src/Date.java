
public class Date {

	private int day;
	private int month;
	private int year;

    public Date(int d,int m,int y) {
    	  day=d;
    	  month=m;
    	  year=y;
    	  
    }
    
    public void setd(int d) {
    	day=d;
    }
    
    public void setm(int m) {
    	month=m;
    }
    public void sety(int y) {
    	year=y;
    }
    
    public int getd() {
    	return day;
    }
    
    public int getm() {
    	return month;
    }
    
    public int gety() {
    	return  year;
    }
    
    public void display() {
    	System.out.println("Date:"+ day+"/"+month+"/"+year);
    }
    
	public static void main(String[] args) {
		Date d1= new Date(27,6,2025);
		
		d1.display();
		
		d1.setd(30);
		d1.setm(12);
		d1.sety(2026);
		
		d1.display();
		
		
	}

}
  