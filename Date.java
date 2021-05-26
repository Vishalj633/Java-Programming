import java.util.Scanner;
public class Date {
	private int day;
	private String month;
	private int year;
	
	Date(){
		this.day=day;
		this.month=month;
		this.year=year;
		day=10;
		month="April";
		year=1998;
	}
	
	public void getDate() {
		System.out.println("Day:"+day);
		System.out.println("Month:"+month);
		System.out.println("Year:"+year);
	}
	
	public void setDate() {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Day:");
		day=input.nextInt();
		System.out.println("Enter Month:");
		month=input.next();
		System.out.println("Enter Year:");
		year=input.nextInt();
		input.close();
	}
	
	public void displayDate() {
		System.out.println(+day+" "+month+","+year);
	}

}
