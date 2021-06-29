import java.util.Scanner;

public class exc21 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int number1, number2, sum;

    	System.out.println("Enter with 2 numbers:");
    	number1 = read.nextInt();
    	number2 = read.nextInt();

    	sum = number1 + number2;

    	if(sum > 10) {
    		System.out.print("Here is your sum: " + sum);
    	}
    }


}