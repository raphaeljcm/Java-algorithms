import java.util.Scanner;

public class exc48 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int num = 0, even = 0;
    	float sumOdd = 0;

    	 while(num != -1){
    		System.out.print("Type up your number and if you wanna get out, type -1: ");
    		num = read.nextInt();

   			if(num == 0) {
   				System.out.println("Your number is invalid, please try again.");
   			}

   			if(num % 2 == 0) {
   				even++;
   			}else if (num != -1){
   				sumOdd += num;
   			}
    	}

		if(even != 0 || sumOdd != 0) {
			System.out.printf("Quantity of even numbers is equal: %d, and the sum of odd numbers is: %.2f", even, sumOdd);
		}
    }
}