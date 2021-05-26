import java.util.Scanner;

public class arrayOperations {
	private static Scanner input;

	public static void main(String[] args) {
		int size, i, sum, avg, max, min;
		System.out.println("Enter the size of an array:");
		
		input = new Scanner(System.in);
		size=input.nextInt();
		
		System.out.println("Enter the elements of an array:");
		int [] userarr=new int[size];
		
		for(i=0;i<userarr.length;i++) {
			userarr[i]=input.nextInt();
		}
		input.close();
		
		System.out.print("Elements of an array:");
		
		for(i=0;i<userarr.length;i++) {
			System.out.print(userarr[i]+",");
		}
		System.out.println();
		sum=0;
		for(i=0;i<userarr.length;i++) {
			sum=sum+userarr[i];
		}
		
		avg=sum/userarr.length;
		
		max=userarr[0];
		min=userarr[0];
		
		for(i=0;i<userarr.length;i++) {
			if(max<userarr[i])
				max=userarr[i];
		}
		
		for(i=0;i<userarr.length;i++) {
			if(min>userarr[i])
				min=userarr[i];
		}
		
		
		System.out.println("Sum :"+sum);
		System.out.println("Average:"+avg);
		System.out.println("Maximum :"+max);
		System.out.println("Minimum :"+min);
		
	}

}
