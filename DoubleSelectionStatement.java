import java.util.Scanner;


public class DoubleSelectionStatement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Username: ");
		String userName = scan.nextLine();
		
		System.out.print("Enter passWord: ");
		String passWord = scan.nextLine();
		
		if(passWord.equals("Admin12345")&& userName.equals("john@williams")){
			System.out.println("Acess Granted, You are Welcome");
	}
	  else{
		 System.out.println("incorrect passWord or userName");
		 
	  }
	}  
}	 