import java.util.Scanner;

public class grossSalary {
	public static void main(String[] args) {
		int bs;
		double gs, hra, da;
		
		System.out.print("Enter your basic salary Rs.");
		Scanner input= new Scanner(System.in);
		bs=input.nextInt();
		input.close();
		
		if(bs<=10000) {
			hra=20;
			da=80;
			gs=bs+(hra/100.0*bs)+(da/100.0*bs);
		}
		else if(bs<=20000){
			hra=25;
			da=90;
			gs=bs+(hra/100.0*bs)+(da/100.0*bs);
		}
		else {
			hra=30;
			da=95;
			gs=bs+(hra/100.0*bs)+(da/100.0*bs);
		}
		System.out.print("Gross salary is Rs."+gs);
	}
	
}
