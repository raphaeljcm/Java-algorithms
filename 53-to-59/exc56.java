import java.util.Scanner;

public class exc56 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String[] names1 = new String[8];
		String[] names2 = new String[8];
		int i;


		for(i=0;i<names1.length;i++) {
			System.out.print("Type a name: ");
			names1[i] = read.nextLine();
		}

		i--;

		for(int j=0;j<names2.length;j++) {
			names2[j] = names1[i - j];
			System.out.printf("\nNames: %s", names2[j]);
		}
	}
}