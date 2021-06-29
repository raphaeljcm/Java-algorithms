import java.util.Scanner;

public class exc54 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = new int[10];

		for(int i=0;i<array1.length;i++) {
			System.out.print("Type a number for the first array: ");
			array1[i] = read.nextInt();
		}

		for(int i=0;i<array2.length;i++) {
			System.out.print("Type a number for the second array: ");
			array2[i] = read.nextInt();
		}

		for(int i=0;i<array3.length;i++) {
			array3[i] = array1[i] + array2[i];
			System.out.println("Number: " + array3[i]);
		}
	}
}