
public class SmallestAndLargestNumber {

	public static void main(String[] args) {
   
		int num[]= {3,2,5,8,9};
		
		int max=num[0];
		int min=num[0];
		
		for (int i=1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			else if(num[i]<min) {
				min=num[i];
				
			}
		}
		System.out.println("min number: "+min);
		System.out.println("max number: "+max);
	}

}
