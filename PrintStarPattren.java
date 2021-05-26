import java.util.Scanner;
public class PrintStarPattren {
	public static void main(String [] args) {
		int num, i, j;
		System.out.print("Enter a Number:");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		input.close();
		
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
