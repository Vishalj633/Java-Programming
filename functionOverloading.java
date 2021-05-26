
public class functionOverloading {
		
		public static void addition(int a, int b) {
			int result=a+b;
			System.out.println("Addition of "+a+" and "+b+" is "+result);    
		}
		public static double addition(double a, double b) {
			double result=a+b;
			System.out.println("Addition of "+a+" and "+b+" is "+result);
			return result;		}
		
		public static void addition() {
			int a = 15;
			int b =25;
			int result=a+b;
			System.out.println("Addition of "+a+" and "+b+" is "+result);    
		}
		public static void addition(int a) {
			int b =50;
			int result=a+b;
			System.out.println("Addition of "+a+" and "+b+" is "+result);    
		}
		public static void addition(String a, int b) {
			System.out.println("Addition of string and number is "+a+" "+b);    
		}
		
		
		public static void main(String[] args) {
			addition();
			addition(55);
			addition(10, 20);
			addition(15.50, 29.5);
			addition(55, 32.6);
			addition("Vishal", 633);
		}

}
