import java.util.Scanner;

public class exc36 {

    public static void main (String[] args) {
    	Scanner read = new Scanner(System.in);

		int age, i = 0, acLess = 0, acMore = 0;

		while(i <= 9) {
			System.out.print("Digite sua idade: ");
			age = read.nextInt();

			if(age < 21) {
				acLess++;
			} else if(age > 50) {
				acMore++;
			}
		i++;
		}
	System.out.println("Total people under 21 is: "+ acLess + " and over 50 is: " + acMore);
    }
}