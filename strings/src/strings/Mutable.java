package strings;

public class Mutable {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("Hello");
        StringBuilder s2=new StringBuilder("Java");
        System.out.println("Append:"+s1.append(s2)); 
        System.out.println("Insert:"+s2.insert(0, s1));
        System.out.println("Length:"+s1.length()); 
        System.out.println("CharAt:"+s1.charAt(2));
        System.out.println("Replace:"+s1.replace(0,5,"Hi"));
        System.out.println("DElete:"+s1.delete(0,2));
        System.out.println("Reverse:"+s1.reverse());    
    }
}
