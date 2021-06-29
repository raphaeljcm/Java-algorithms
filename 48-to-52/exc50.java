import java.util.Scanner;

public class exc50 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

		String desc = "";
    	int qtd;
    	float price = 0, purchaseAmount = 0, total = 0;

		System.out.println("Welcome! Type FIM or fim when I want to get out of the program!");

    	do {
    	 	System.out.print("Type the description of the product: ");
    		desc = read.nextLine();

    		if(!desc.equals("FIM") && !desc.equals("fim")) {
    			System.out.print("Type the price of the product: ");
    			price = read.nextFloat();
    			System.out.print("Type the quantity of products: ");
    			qtd = read.nextInt();

				purchaseAmount = price * qtd;
				total +=  purchaseAmount;
				purchaseAmount = 0;
    		}

			read = new Scanner(System.in);

    	} while(!desc.equals("FIM") && !desc.equals("fim"));

		if(total != 0) {
			System.out.printf("Total purchase amount: %.2f", total);
		}
    }
}