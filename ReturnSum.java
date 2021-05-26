
public class ReturnSum {
	public static int sum(int a, int b) {
		int sum=a+b;
		System.out.println("Sum of given integers is "+sum);
		return sum;	
	}
	
	public static int sum(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println("Sum of given integers is "+sum);
		return sum;		
	}
	
	public static int sum(int a, int b, int c, int d) {
		int sum=a+b+c+d;
		System.out.println("Sum of given integers is "+sum);
		return sum;		
	}
	

	public static void main(String[]args) {
		
		sum(15,20);
		sum(25,99,88);
		sum(36, 58, 52, 55);
	}

}
