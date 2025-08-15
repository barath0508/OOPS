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

class ROG extends Asus{
	void model() {
		System.out.println("Model is ROG");
	}
} 


public class Multi_Inheritance {
	public static void main(String[] args) {
		ROG rog = new ROG();
		rog.display();
		rog.brand();
		rog.model();
	
	
		

	}

}
