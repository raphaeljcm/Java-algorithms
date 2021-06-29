import java.util.Scanner;

public class exc46 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

		String name;
    	int i = 0, amount;
    	float price = 0, totalValue = 0;

		System.out.println("Welcome to our system, let's do your shopping!");

    	do {
    		System.out.print("Type the name of your product: ");
    		name = read.nextLine();

    		if(!name.equals("FIM") && !name.equals("fim")) {

    			while(true) {
    				System.out.print("Type the price: ");
    				price = read.nextFloat();

    				System.out.print("Type the amount: ");
    				amount = read.nextInt();

    				if(price <= 0 || amount <= 0) {
    					System.out.println("Preço ou quantidade inválida");
    				}else {
    					break;
    				}
    			}

    			price = price*amount;
    			i++;
    		}
			totalValue += price;
    		price = 0;
    		amount = 0;

    		read = new Scanner(System.in);
    	} while(!name.equals("FIM") && !name.equals("fim"));
    	System.out.printf("Total value: %.2f", totalValue);
    }
}