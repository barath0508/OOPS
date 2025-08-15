package constructor;
class student{
    int id=0;
    String name="";
    student(){
        id=13;
        name="Barath";
    }
    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
}
public class Default_constructor {
	public static void main(String[]args){
		student s1= new student();
		s1.display();
	}

}
