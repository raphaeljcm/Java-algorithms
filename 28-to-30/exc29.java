import java.util.Scanner;

public class exc29 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int month;

    	System.out.print("Type a number: ");
    	month = read.nextInt();

		switch(month) {
    		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    			System.out.print("31 days.");
    			break;
    		case 2:
    			System.out.print("28/29 days.");
    			break;
    		case 4: case 6: case 9: case 11:
    			System.out.print("30 days.");
    			break;
    		default:
    			System.out.print("Invalid number!");
		}
    }
}