import java.util.Scanner;

public class exc10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// Which was the average consumption of a car?

		double ac, dist, vol; // average consumption, distance, volume of fuel consumed

		System.out.print("Type the distance: ");
		dist = read.nextDouble();

		System.out.print("Type the volume of fuel consumed: ");
		vol = read.nextDouble();

		ac = dist/vol;

		System.out.println("Average consumption was: " + ac);
	}
}