package constructor;
class student3{
    int id=0;
    String name="";
    
    student3(int ID,String NAME){
        id=ID;
        name=NAME;
    }
    
    student3(student3 s1){
        id=s1.id;
        name=s1.name;
    }
    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
}
public class Copy_constructor {
	public static void main(String[]args){
		student3 s1= new student3(13,"Barath");
		s1.display();
		student3 s2= new student3(s1);
		s2.display();		
	}

}
