public class DataType{
	public static void main(String[] args){
		//integer Type
		byte age = 25;
		System.out.printf("Your are %d years old%n",age );
		
		short quantity = 30000;
		System.out.printf("I bought %,d quantity of phones%n",quantity);
		
		int population = 292527826;
		System.out.printf("The population in Nigeria is %,d%n",population);
		
		long wordpopulation = 729737380000000L;
		System.out.printf("The word's population is %,d%n",wordpopulation);
		
		
		//Float-point
		float myBalance = 67060742.8672f;
		System.out.printf("My account balance is $%,.2f%n",myBalance);
		
		double cbnBalance = 6354627383399298263.74463;
		System.out.printf("The CBN balance is %,.2f%n",cbnBalance);
		
		char sysmbol = '@';
		System.out.printf("Your email address is emmavin1%cgmail.com%n",sysmbol);
		
		boolean isJava = true;
		System.out.printf("Do you love learning Java ? %b%n",isJava);
	}
}	