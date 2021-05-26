
public class TestDate {
	public static void main(String[]args) {
		Date D1=new Date();
		System.out.print("Default Date: ");
		D1.displayDate();
		System.out.println("Getter:");
		D1.getDate();
		System.out.println("Setter:");
		D1.setDate();
		System.out.print("Updated Date: ");
		D1.displayDate();
	}

}
