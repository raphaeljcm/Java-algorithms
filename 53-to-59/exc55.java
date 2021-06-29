import java.util.Scanner;

public class exc55 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String[] names = new String[8];

		for(int i=0;i<names.length;i++) {
			System.out.print("Type a name: ");
			names[i] = read.nextLine();
		}

		for(int i=7;i>=0;i--) {
			System.out.printf("\nHere are the names: %s", names[i]);
		}
	}
}