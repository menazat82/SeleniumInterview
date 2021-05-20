import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {


		String arr[]= {"Java","JavaScript","Ruby","C","Python","Java","Ruby"};
		
		HashSet <String> langs=new HashSet();
		
		boolean flag=false;
	
		for(String l:arr) {
			
			if (langs.add(l)==false) {
				System.out.println("Found duplicate element: "+l);
				flag=true;
			}
		}
		if(flag==false) {
     System.out.println("Not found duplicates");
			
	}
	}
}
