
public class Calculations {

	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		
		//sum of x and y 
		int sum = x+y;
		System.out.println("The sum is= "+ sum);
		
		//member_B add the feature of subtracting x from y and print the result
		int subt = x-y;
		System.out.println("The subt is= "+ subt);
		//member_C add the feature of dividing x by y and print the result
		int quotient = x/y;
		System.out.print("The quotient is=" + quotient);
		//member_D add the feature of multiplying x by y and print the result
		int mult = x*y;
		System.out.println("The multiplication is= " + mult);
		
		
		//Exercise 5: Spot the issues to be reported
		addition(4,5); // should print the sum of the values provided
		welcome(); // should print the welcome message to the console
	}
	
	public static int addition(int w, int z) {
		int sum = w + z;
		return sum; 
	}
	
	public static void welcome() {
		System.out.println("Hello World"); 
	}

}
