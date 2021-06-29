import java.util.Scanner;

public class exc41 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int num, qtdEven = 0, qtdOdd = 0, i;
    	float mediaEven = 0, mediaOdd = 0, sumEven = 0, sumOdd = 0;

    	for(i=0; i<=4; i++) {
    		System.out.print("Type up your number: ");
    		num = read.nextInt();

			if(num == 0) {
				System.out.println("Invalid number.");
				i--;
			}else if(num % 2 == 0) {
   				sumEven += num;
   				qtdEven++;
				mediaEven = sumEven/qtdEven;
   			}else {
   				sumOdd += num;
   				qtdOdd++;
				mediaOdd = sumOdd/qtdOdd;
   			}
    	}
    	System.out.printf("Average of even numbers: %.2f, and odd ones: %.2f", mediaEven, mediaOdd);
    }
}