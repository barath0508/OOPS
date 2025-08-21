package Lab;
import java.util.Scanner;
public class Prime_Number {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        int c= 0;
        for (int i=1;i<=num;i++){
            if (num%i== 0) {
                c++;
            }
        }
        if (c==2){
            System.out.println("Prime number.");
        } else{
            System.out.println("Not a prime number.");
        }   
    }
}
