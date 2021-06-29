import java.util.Scanner;

public class exc14 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int number;

    	System.out.print("Type your number: ");
    	number = read.nextInt();

    	if(number == 0) {
    		System.out.println("Your number is null.");
    	} else if(number % 2 == 0) {
    		System.out.println("Your number is a even number.");
    	} else{
    		System.out.print("Your number is a odd number.");
    	}
    }
}