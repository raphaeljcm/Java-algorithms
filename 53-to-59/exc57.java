import java.util.Scanner;

public class exc57 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] x = new int[4];
		int[] y = new int[4];
		int[] z = new int[8];


		for(int i=0;i<x.length;i++) {
			System.out.print("Type a number: ");
			x[i] = read.nextInt();
		}

		for(int i=0;i<y.length;i++) {
			System.out.print("Type a number: ");
			y[i] = read.nextInt();
		}

		for(int i=0;i<x.length;i++) {
			z[i] = x[i];
			z[i+4] = y[i];
		}

		for(int k : z) {
			System.out.print(" " + k + " ");
		}
	}
}

/* Como eu tinha feito:
 for(int j=0;j<y.length;j++) {
 	z[j+4] = y[j];
}

Poderia usar também uma variável auxiliar dentro do z[aux] e a cada rodada aux++;
*/