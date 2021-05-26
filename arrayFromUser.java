import java.util.Scanner;

public class arrayFromUser {
	public static void main(String[]args) {
		int size, i, num;
		int [] userarr;
		
		System.out.println("Enter the size of an array:");
		
		Scanner input =new Scanner(System.in);
		size=input.nextInt();
		
        userarr=new int[size];
        
		System.out.println("Elements of array are: ");
		for (i=0;i<userarr.length;i++) {
			userarr[i]=input.nextInt();
		}
		
		
		
		System.out.println("The elements you entered are :");
		for(i=0;i<userarr.length;i++)
			System.out.print(+userarr[i]+",");
		//for(int i1 : userarr)
			//System.out.print(i1+","); 
		
		System.out.println("");
		
		System.out.println("Enter a Number to search:");
		num=input.nextInt();
		
		for(i=0;i<userarr.length;i++) {
			
			if(userarr[i]==num) {
				System.out.println("Number is present at index"+i);
				break;
			}
			else if(i==(userarr.length-1))
				System.out.println("Number does not exist in the array.");
			else
				;
				
		}
		input.close();
		
	}

}
