package Inheritance;

interface gas {
	 void air();
	}

interface liquid {
	 void water();
	}

class Earth implements gas,liquid {
	 public void air() {
	     System.out.println("Air is present in earth");
	 }
	
	 public void water() {
	     System.out.println("Earth has Water");
	 }
}

public class Multiple_Inheritance {
	public static void main(String[] args) {
	     Earth e = new Earth();
	     e.air();
	     e.water();
	 }

}
