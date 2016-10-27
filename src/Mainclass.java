
public class Mainclass {

	
	public static void main(String[] args) {
		int i = 0;
		
		while (i < 5){
			i++;
			System.out.println("Loop number is: " + i + " started.");

			if (i == 3){
				continue;  
				}
			
			System.out.println("Loop number is: " + i + " finished.");
			
		}	
		
	}	 

}
