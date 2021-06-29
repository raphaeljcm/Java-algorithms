import java.util.Scanner;

public class exc26 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

		double val, salePrice = 0;
    	String product;

    	System.out.print("Enter with the name of the product: ");
    	product = read.nextLine();

    	System.out.print("Now, enter with the price of the product: ");
    	val = read.nextDouble();

		if(val < 100) {
			salePrice = val +(val*0.70); // 70% profit
		}else if(val >= 100 && val <= 200) {
			salePrice = val +(val*0.50); // 50% profit
		}else if(val > 200) {
			salePrice = val +(val*0.30); // 30% profit
		}else {
			System.out.print("Error, try again!");
		}
		System.out.print("The product " +product+ " was bought for R$" +val+ " and will be sold for R$" +salePrice);
    }
}