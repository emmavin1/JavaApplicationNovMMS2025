public class RecursiveMethod{
	
	public static void main(String[] args){
		
		displayName("John Williams");
		
	}
	
	public void displayName(String name){
		System.out.println(name);
		
		
		displayName(name);
		
		
	}

}	