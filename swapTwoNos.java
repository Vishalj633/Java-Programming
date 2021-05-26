public class swapTwoNos {
	
	public static void swap(int a, int b) {
		int temp;
		temp = a;
	    a = b;
	    b = temp;
	    System.out.println("The two numbers after swapping are:"+a+" and "+b);
	    
	}
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("The values of two numbers are:"+a+" and "+b);
		swap(a, b);
	}

}

