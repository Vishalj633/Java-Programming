import java.util.Scanner;

public class arrrayMaxMin {
	public static void main(String[] args) {
		int size, i, max, min;
		System.out.println("Enter the size of an array:");
		
		Scanner input=new Scanner(System.in);
		size=input.nextInt();
		
		System.out.println("Enter the elements of an array:");
		int [] userarr=new int[size];
		for(i=0;i<userarr.length;i++) {
			userarr[i]=input.nextInt();
		}
		System.out.print("Elements of the array:");
		input.close();
		
		for(i=0;i<userarr.length;i++) {
			System.out.print(userarr[i]+",");
		}
		
		System.out.println();
		
		max=userarr[0];
		min=userarr[0];
		for(i=0;i<userarr.length;i++) {
			if(max<userarr[i]) {
				max=userarr[i];
			}
			if(min>userarr[i]) {
				min=userarr[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		
	}

}
