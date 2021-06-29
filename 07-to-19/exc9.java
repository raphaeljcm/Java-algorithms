import java.util.Scanner;

public class exc9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double height, base, area;

		System.out.print("Enter with the base of the triangle: ");
		base = read.nextDouble();

		System.out.print("Enter with the height of the triangle: ");
		height = read.nextDouble();

		area = (base*height)/2;

		System.out.println("Triangle area is: " + area);
	}
}