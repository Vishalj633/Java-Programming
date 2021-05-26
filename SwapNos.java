import java.util.Scanner;

public class SwapNos {
	public static void main(String[] args) {
		
		int no1, no2, temp;
		
		Scanner no=new Scanner(System.in);
		System.out.print("Enter First Number:");
		no1=no.nextInt();
		System.out.print("Enter Second Number:");
		no2=no.nextInt();
		no.close();
		
		System.out.println("Two numbers you entered are "+no1+" and "+no2);
		
		temp=no1;
		no1=no2;
		no2=temp;
		
		System.out.println("After swapping numbers are "+no1+" and "+no2);
	}

}
