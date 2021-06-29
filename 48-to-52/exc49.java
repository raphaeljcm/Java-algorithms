import java.util.Scanner;

public class exc49 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int num = 1, odd = 0;
    	float sumEven = 0;

    	 while(num != 0){
    		System.out.print("Type up your number and if you wanna get out, type 0: ");
    		num = read.nextInt();

   			if(num % 2 != 0) {
   				odd++;
   			}else {
   				sumEven += num;
   			}
    	}
			System.out.printf("Quantity of odd number is equal: %d, and the sum of even numbers is: %.2f", odd, sumEven);
    }
}