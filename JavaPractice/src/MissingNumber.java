
public class MissingNumber {

	public static void main(String[] args) {

		  
	
		int a[]= {1,2,3,5,6,7,8,9};
         int sum1=0;
	
         for(int i=0; i<=7;i++) {
			
			  sum1=sum1+a[i];
			
			  
		}
		 System.out.println(sum1);
		 int sum2=0;
	for (int j=1; j<=9; j++) {
		
		  sum2=sum2+j;
	}
	
	System.out.println(sum2);
	
	System.out.println("Missing number ia: "+ (sum2-sum1));
	}

}