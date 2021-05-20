
public class RemoveJunk {

	public static void main(String[] args) {
  
		
	String st="$@#@the^^&#best";
	  
	
	st=st.replaceAll("[^a-zA-Z0-9]","");
 	 System.out.println(st);
		
	}

}
