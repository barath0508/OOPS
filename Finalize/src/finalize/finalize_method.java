package finalize;
class demo {
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is called");
    }
}
public class finalize_method {
	public static void main(String[] args){
		demo obj = new demo();
		obj=null;
		System.gc();
		System.out.println("End of main");
	}
}
 