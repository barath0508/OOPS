class Student {
	    String name;
	    int rollno;
	    String grade;
	    public static void main(String[]args) {
	        Student student1=new Student();
	        student1.name="Akash";
	        student1.rollno=123;
	        student1.grade="A";

	        Student student2=new Student();
	        student2.name="Suresh";
	        student2.rollno=150;
	        student2.grade="O";

	        Student student3=new Student();
	        student3.name="Saran";
	        student3.rollno=130;
	        student3.grade="B";

	        System.out.println("Name:"+student1.name);
	        System.out.println("Roll No:"+student1.rollno);
	        System.out.println("Grade:"+student1.grade);

	        System.out.println("Name:"+student2.name);
	        System.out.println("Roll No:"+student2.rollno);
	        System.out.println("Grade:"+student2.grade);

	        System.out.println("Name:"+student3.name);
	        System.out.println("Roll No:"+student3.rollno);
	        System.out.println("Grade:"+student3.grade);
	    }
	}
}
