import java.util.Scanner;

public class exc33 {

    public static void main (String[] args) {
    	Scanner read = new Scanner(System.in);

    	double num, soma = 0, media, dobro;
    	int i = 1;

		while(i <= 5) {
			System.out.print("Enter with your numbers: ");
			num = read.nextDouble();
			soma += num;
			media = soma/i;
			dobro = soma*2;
			System.out.printf("Your number %.2f, soma %.2f, media %.2f e dobro %.2f. %n \n", num, soma, media, dobro, i);
			i++;
		}
    }
}