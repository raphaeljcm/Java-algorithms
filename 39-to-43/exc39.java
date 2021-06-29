import java.util.Scanner;

public class exc39 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int num, even = 0, odd = 0, sumEven = 0, sumOdd = 0, i;

    	for(i=0; i<=9; i++) {
    		System.out.print("Type up your number: ");
    		num = read.nextInt();

   			if(num == 0) {
   				System.out.println("Your number is invalid, please try again.");
   				i--;
   			}

   			if(num % 2 == 0) {
   				even++;
   				sumEven += num;
   			}else {
   				odd++;
   				sumOdd += num;
   			}
    	}

    	System.out.printf("Amount even numbers: %d, amount odd numbers: %d, sum even numbers: %d, finally sun odd numbers: %d.", even, odd, sumEven, sumOdd);
    }
}