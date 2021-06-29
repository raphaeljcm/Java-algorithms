import java.util.Scanner;

public class exc37 {

    public static void main (String[] args) {
    	Scanner read = new Scanner(System.in);

		int num, i = 0, even = 0, odd = 0;

		while(i <= 9) {
			System.out.print("Type your number: ");
			num = read.nextInt();

			if(num == 0) {
				System.out.print("Your number is invalid, please try again.");
				return;
			}

			if(num % 2 == 0) {
				even++;
			} else if(num % 2 == 1) {
				odd++;
			}
		i++;
		}
	System.out.println("Total of number even is: "+ even + " and odd is: " + odd);
    }
}