import java.util.Scanner;

public class exc8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double val1, val2, val3, media;

		System.out.println("Enter with the grades");
		val1 = read.nextDouble();
		val2 = read.nextDouble();
		val3 = read.nextDouble();

		media = (val1+val2+val3)/3;

		System.out.println("Media is: " + media);
	}
}