import java.util.Scanner;

public class exc13 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

		int number;

    	System.out.print("Type a number: ");
    	number = read.nextInt();

    	if (number == 0) {
    		System.out.println("Your number is null.");
    	} else if (number > 0){
    		System.out.println("Your number is positive.");
    	} else{
    		System.out.println("Your number is negative.");
    	}
    }
}