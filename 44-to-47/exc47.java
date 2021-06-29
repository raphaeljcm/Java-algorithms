import java.util.Scanner;

public class exc47 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int num, positive = 0, negative = 0, i = 0;
    	float sumPositive = 0, sumNegative = 0;

    	do {
    		System.out.print("Type up your number: ");
    		num = read.nextInt();

   			if(num == 0) {
   				System.out.println("Your number is invalid, please try again.");
   			}

   			if(num > 0) {
   				positive++;
   				sumPositive+= num;
   				i++;
   			}else if (num < 0) {
   				negative++;
   				sumNegative += num;
   				i++;
   			}
    	} while(i != 15);

    	System.out.printf("Quantity and sum of positive numbers: %d | %.2f and negative ones: %d | %.2f", positive, sumPositive, negative, sumNegative);
    }
}