import java.util.Scanner;

public class exc45 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int i = 0;
    	float num = 0, somaNum = 0;

    	do {
    		System.out.print("Type a number: ");
    		num = read.nextFloat();

    		if(num > 5) {
    			somaNum += num;
    			i++;
    		}
    	} while(num!=0);
    	System.out.printf("Sum: %.2f", somaNum);
    }
}