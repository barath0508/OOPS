package static_example;

class student{
	static int mark=0;
	
}

public class with_static {
	public static void main(String []args) {
		student s1=new student();
		s1.mark=70;
		student s2=new student();
		s2.mark=90;
		
		System.out.println(s1.mark);
		System.out.println(s2.mark);
	}

}
