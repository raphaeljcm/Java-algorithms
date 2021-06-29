import java.util.Scanner;

public class exc58 {

    public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double[] prices = new double[4];

		for(int i=0;i<prices.length;i++) {
			System.out.print("Type a price: ");
			prices[i] = read.nextFloat();

			if(i>=3) {
				for(int j=0;j<prices.length;j++) {
					prices[j] = prices[j] + (prices[j] * 0.10);
				}
			}
		}

		System.out.print("\nPrices with 10% increase: ");

		for(double k : prices) {
			System.out.print("R$" + k + " ");
		}
    }
}