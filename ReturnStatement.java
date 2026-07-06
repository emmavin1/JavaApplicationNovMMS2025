public class ReturnStatement{
	public static void main(String[] args){
		System.out.println("The area of the rectangle is " + areaOfRectangle(7,20));
		System.out.println("The area of the rectangle is " + areaOfRectangle(76,20));
		System.out.println("The area of the rectangle is " + areaOfRectangle(20,100));
		System.out.println("The area of the rectangle is " + areaOfRectangle(90,20));
		System.out.println("The area of the rectangle is " + areaOfRectangle(30,20));
	
	}
	
	public static int areaOfRectangle(int length, int height){
        int area = length * height;

        return area;
	}	
}	