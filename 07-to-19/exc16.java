import java.util.Scanner;

public class exc16 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int number;

    	System.out.print("Type a number: ");
    	number = read.nextInt();

    	if(number % 5 == 0) {
    		System.out.println("Your number is divisible by 5.");
    	}else {
    		System.out.println("Your number isn't divisible by 5.");
    	}
    }
}