package constructor;
class student2{
    int id=0;
    String name="";
    
    student2(){
        id=13;
        name="Barath";
    }
    
    student2(int ID,String NAME){
        id=ID;
        name=NAME;
    }
    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
}
public class Constructor_overloading {
	public static void main(String[]args){
		student2 s1= new student2();
		s1.display();
		student2 s2= new student2(15,"BS");
		s2.display();		
	}

}
