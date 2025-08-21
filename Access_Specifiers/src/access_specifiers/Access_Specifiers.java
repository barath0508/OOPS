package access_specifiers;

class Student {     
    public String name="Barath"; 
    protected int rollno=240013;  
    String college="RIT";  
    private int mark=95;
    public void info() {
    	System.out.println("Name:"+name);
    	System.out.println("Roll No:"+rollno);
    	System.out.println("College:"+college);
    	System.out.println("Mark:"+mark);
    	}
    }

public class Access_Specifiers {
	public static void main(String[] args) {
		Student s=new Student();
		
		System.out.println("Name:"+s.name);
    	System.out.println("Roll No:"+s.rollno);
    	System.out.println("College:"+s.college);
    	
		
		s.info();
			
	

	}

}
