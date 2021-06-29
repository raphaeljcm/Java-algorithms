import java.util.Scanner;

public class exc24 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int num1, num2;

    	System.out.println("Enter with 2 numbers: ");
    	num1 = read.nextInt();
    	num2 = read.nextInt();

    	if(num1 == num2) {
    		System.out.print("I have to type different numbers, try again!");
    	}else if(num1 > num2) {
    		System.out.print("Your numbers in descending order: " +num1+ ", " +num2);
    	}else {
    		System.out.print("Your numbers in descending order: " +num2+ ", " +num1);
    	}
    }
}