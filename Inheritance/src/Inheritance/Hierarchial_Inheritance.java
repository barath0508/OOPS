package Inheritance;

class India {
	void country() {
		System.out.println("Country India");
	}
}

class TN extends India {
	void state1() {
		System.out.println("State Tamilnadu");
	}
}

class KA extends India {
	void state2() {
		System.out.println("State Karnataka");
	}
}

class AP extends India {
	void state3() {
		System.out.println("State Andra Pradesh");
	}
}

public class Hierarchial_Inheritance {
	public static void main(String[] args) {
		TN tn=new TN();
		KA ka=new KA();
		AP ap=new AP();
		
		tn.country();
		tn.state1();
		ka.country();
		ka.state2();
		ap.country();
		ap.state3();
		
		
	}

}
