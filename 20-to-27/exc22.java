import java.util.Scanner;

public class exc22 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int valA, valB, valC;

    	System.out.println("Enter with 2 numbers: ");
		valA = read.nextInt();
		valB = read.nextInt();

		if(valA == valB) {
			valC = valA + valB;
		} else {
			valC = valA * valB;
		}
		System.out.print("ValA: " +valA + " ValB: "+valB+ " ValC: " +valC);
    }
}