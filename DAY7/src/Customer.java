
public class Customer {

	private int accNo=0;
	private int balAtBeg=0;
	private int totalItem=0;
	private int totalCredit=0;
	private int crlimit=0;
	
//	public Customer() {
//		accNo=0;
//		balAtBeg=0;
//		totalItem=0;
//		totalCredit=0;
//		crlimit=0;
//	}
	
	public void setdata(int a,int b,int i,int c,int l) {
		this.accNo=a;
		this.balAtBeg=b;
		this.totalItem=i;
		this.totalCredit=c;
		this.crlimit=l;
	}
	
    public int CalNbal() {
    	    return balAtBeg + totalItem - totalCredit;
    }
    
}
