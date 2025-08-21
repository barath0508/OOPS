package Inheritance;

class solar_system{
	void ss() {
		System.out.println("Thsi is Solar System");
	}
}

class earth extends solar_system{
	void planet1() {
		System.out.println("This is Earth");
	}
}

class jupiter extends solar_system{
	void planet2() {
		System.out.println("This is Jupiter");
	}
}

class moon extends earth{
	void moon1() {
		System.out.println("This is Moon");
	}
}

class europa extends jupiter{
	void moon3() {
		System.out.println("This is Europa");
	}
}

public class Hybrid_Inheritance {
	public static void main(String[]args) {
		europa j=new europa();
		moon e=new moon();
		
		e.ss();
		e.planet1();
		e.moon1();
		j.ss();
		j.planet2();
		j.moon3();
		
	}

}
