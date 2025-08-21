package strings;

public class Immutable {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String("Java");
        System.out.println("Concat:"+s1.concat(s2));
        System.out.println("Concat:"+s2.concat(s1));
        System.out.println("Length:"+s1.length());
        System.out.println("CharAt:"+s1.charAt(2));
        System.out.println("To upper:"+s2.toUpperCase());
        System.out.println("To lower:"+s2.toLowerCase());
        System.out.println("Equals:"+s1.equals(s2));
    }
}
