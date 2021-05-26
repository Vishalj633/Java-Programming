
public class stringArrUpper {
	public static void stringArr(){
		int i;
		String [] arr= {"Vishal", "Yogesh","Saurabh","Tejas", "Aditya"};
		
		for(i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		
		System.out.println();
		System.out.println("Upper Case Array:");
		
		for(i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i].toUpperCase());
		}
	}
	
	public static void main(String[]args) {
		stringArr();
	}

}
