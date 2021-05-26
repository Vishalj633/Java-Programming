
public class Customer {
	private String name;
	private String email;
	private int age;
	
	Customer(String name, String email, int age) {
		this.name=name;
		this.email=email;
		this.age=age;
	}
	
	Customer() {
		this.name=name;
		this.email=email;
		this.age=age;
		
		name="Riya";
		email="riya@gmail.com";
		age=25;
	}
	
	public void displayCustomer() {
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Age:"+age);
		
	}
}
