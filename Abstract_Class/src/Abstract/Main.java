package Abstract;

abstract class electricals{
	abstract void on();
	void off() {
		System.out.println("Turned off");
	}
}

class fan extends electricals{
	void on() {
		System.out.println("Fan turned on");
	}
}

class light extends electricals{
	void on() {
		System.out.println("Light turned on");
	}
}
public class Main {
	public static void main(String[] args) {
		electricals f=new fan();
		electricals l=new light();
		f.on();
		f.off();
		l.on();
		l.off();
		
	}

}
