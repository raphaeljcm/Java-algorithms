import java.util.Scanner;

public class exc38 {

    public static void main (String[] args) {
    	Scanner read = new Scanner(System.in);

		int num, i = 0, positiveNumber = 0, negativeNumber = 0, sumP = 0, sumN = 0;

		while(i <= 5) {
			System.out.print("Type your number: ");
			num = read.nextInt();

			if(num == 0) {
				System.out.print("Your number is invalid, please try again.");
				return;
			}

			if(num > 0) {
				positiveNumber++;
				sumP++;
			} else if(num < 0) {
				negativeNumber++;
				sumN++;
			}
			i++;
		}
		System.out.println("Total of positive numbers is: "+ positiveNumber + " and negative one is: " + negativeNumber);
		System.out.print("Now, sum of all the positive one: " + sumP + " and the negative one: " + sumN);
    }
}