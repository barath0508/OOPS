package Inheritance;

class Laptop{
	void display() {
		System.out.println("This is Laptop");
	}
}

class Asus extends Laptop{
	void brand() {
		System.out.println("Brand is Asus");
	}
}

public class Single_Inheritance {
	public static void main(String[]args) {
		Asus asus=new Asus();
		asus.display();
		asus.brand();
	}
	
}
