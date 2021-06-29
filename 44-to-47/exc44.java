import java.util.Scanner;

public class exc44 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int i = 1;
    	float mediaSom = 0, num = 0, somaNum = 0;

    	do {
    		System.out.print("Type a number: ");
    		num = read.nextFloat();

    		if(num > 0) {
    			somaNum += num;
    			mediaSom = somaNum/i;
    			i++;
    		}
    	} while(num!=0);
    	System.out.printf("Average: %.2f", mediaSom);
    }
}