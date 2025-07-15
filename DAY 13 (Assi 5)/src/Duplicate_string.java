
public class Duplicate_string {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
         String[] arr1 = {"Apple","Orange","Banana"};
         String[] arr2= {"Banana","Grapes","Apple"};
      
         for(int i=0;i<3;i++) {
        	   
        	   for(int j=0;j<3;j++) {
        		   
              	 if(arr1[i].equals(arr2[j])) System.out.println("Common String variable: "+arr1[i]);
              	  
        	    }
         }  
	}
}
