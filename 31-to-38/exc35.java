import java.util.Scanner;

public class exc35 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

		int num, soma = 0, i = 0;;

		while(i<=9) {
			System.out.print("Enter with your number: ");
			num = read.nextInt();

			if(num < 40) {
				soma += num;
			}
			i++;
		}
		System.out.printf("Resultado: %d.", soma);
    }
}