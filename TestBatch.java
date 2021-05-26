package package2;

import package1.Student;

public class TestBatch {
	
	public static void main(String[]args) {
		
		Student s1=new Student();//object from diff. package
		System.out.println("Enter details of Student :");		
		s1.accept();//not accessible as default access
		s1.display();//modifier is there for these methods
	}

}
