import java.util.Scanner;

public class exc52 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String sexo;
		float weight, sumAge = 0, averageAge = 0, sumWeight = 0, averageWeight = 0;
		int age, masc = 0, fem = 0;

		System.out.println("Welcome! If you wanna leave the system, type -1!");

		do {
			System.out.print("Type your age: ");
			age = read.nextInt();

			if(age != -1) {
				System.out.print("Type your weight: ");
				weight = read.nextFloat();
				System.out.print("Type your sexo, please use only 1 caractere, like M for masculine and F for female: ");
				sexo = read.next();

				if(sexo.equals("M") || sexo.equals("m")) {
					masc++;
					sumAge += age;
					averageAge = sumAge/masc;
					System.out.println("");
				} else if(sexo.equals("F") || sexo.equals("f")) {
					fem++;
					sumWeight += weight;
					averageWeight = sumWeight/fem;
					System.out.println("");
				} else {
					System.out.println("Invalid!");
				}
			}

		} while(age != -1);

		if(sumAge != 0 || sumWeight != 0) {
			System.out.printf("Total men: %d, total women: %d, average men's ages: %.2f and finally average women's weights: %.2f.", masc, fem, averageAge, averageWeight);
		}
	}
}