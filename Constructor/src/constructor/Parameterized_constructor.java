package constructor;
class student1{
    int id=0;
    String name="";
    student1(int ID,String NAME){
        id=ID;
        name=NAME;
    }
    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
}
public class Parameterized_constructor {
	public static void main(String[]args){
		student1 s1= new student1(13,"Barath");
		s1.display();
	}
}
