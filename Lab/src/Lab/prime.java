package Lab;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        if (n<=1) {
            System.out.println("Not a prime number");
        } 
        else {
            boolean prime = true;
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0) {
                    prime=false;
                    break;
                }
            }
            if (prime){
                System.out.println("Prime number");
            } 
            else{
                System.out.println("Not a prime number");
            }
        }
    }
}
