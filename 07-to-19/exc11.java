import java.util.Scanner;

public class exc11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int pd = 0.12; // percentage of distributor = 12%
		int taxes = 0.45; // taxes literally = 45%
		int factoryCost, consumerCost;

		System.out.print("Enter with factory cost: ");
		factoryCost = read.nextDouble();

		consumerCost = factoryCost + (factoryCost*pd) + (factoryCost*taxes);

		System.out.printf("Result is: %.2f", consumerCost);
	}
}