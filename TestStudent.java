package package1;

import package2.Batch;

public class TestStudent {
	public static void main(String[]args) {
		Batch b1=new Batch(); //b1 object from diff. package
		System.out.println("Enter Details: ");
		b1.accept();
		System.out.println("Students Details: ");
		b1.display();
		Student s1=new Student();//object from diff. package
		System.out.println("Enter details of Student :");		
		s1.accept();//not accessible as default access
		s1.display();//modifier is there for these methods
	
	}

}
