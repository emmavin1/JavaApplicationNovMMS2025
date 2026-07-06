public class InstancesMethod{
	
	//method
	
	public static void main(String[] args){
		InstancesMethod obj = new InstancesMethod();
		
		System.out.println(obj.addNumber(50,80,70));
		System.out.println(obj.addNumber(60,40));
	}
	
	//method
    public  int addNumber(int num1, int num2, int num3){
        int addition = num1 + num2 + num3;
		
		return addition;
		
    }
    
    public  int addNumber(int num1, int num2){
        int addition = num1 + num2;
		
		return addition;
	}	
	
	
}	