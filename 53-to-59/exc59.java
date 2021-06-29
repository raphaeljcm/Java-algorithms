import java.util.Scanner;

public class exc59 {

    public static void main(String[] args) {
 		Scanner read = new Scanner(System.in);

 		int[] numbers = new int[4];
 		int smallestNumber = 0, equalsQtd = 0;

 		for(int i=0;i<numbers.length;i++) {
 			System.out.print("Type a number: ");
 			numbers[i] = read.nextInt();

			if(i == 0) {
				smallestNumber = numbers[i];
			} else if(numbers[i] < smallestNumber) {
 				smallestNumber = numbers[i];
 			}
 		}

		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] == smallestNumber) {
				equalsQtd++;
			}
		}

		if(equalsQtd == 4) {
			System.out.print("All the numbers are the same.");
		} else {
			for(int i=0;i<equalsQtd;i++) {
				if(numbers[i] == smallestNumber) {
					System.out.printf("\nSmallest number is: %d and your position in array is: %d", smallestNumber, i);
				}
			}
		}
    }
}