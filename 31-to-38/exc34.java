import java.util.Scanner;


public class exc34 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int i = 0, num, numP = 0, numN = 0;
    		while (i <= 9) {
    			System.out.print("Enter with your number: ");
    			num = read.nextInt();
    				if(num > 0) {
    					numP += num;
    				} else if(num < 0) {
    					numN += num;
    				}
    			i++;
    		}
    	System.out.printf("Números positivos %d, números negativos %d.", numP, numN);
    }
}