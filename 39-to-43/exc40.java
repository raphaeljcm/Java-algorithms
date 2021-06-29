import java.util.Scanner;

public class exc40 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int num, qtdNegative = 0, qtdPositive = 0, i;
    	float mediaPositive = 0, mediaNegative = 0, sumNegative = 0, sumPositive = 0;

    	for(i=0; i<=4; i++) {
    		System.out.print("Type up your number: ");
    		num = read.nextInt();

			if(num == 0) {
				System.out.println("Invalid number.");
				i--;
			}else if(num > 0) {
   				sumPositive += num;
   				qtdPositive++;
   				mediaPositive = sumPositive/qtdPositive;
   			}else if(num < 0) {
   				sumNegative += num;
   				qtdNegative++;
   				mediaNegative = sumNegative/qtdNegative;
   			}
    	}

		/*Posso fazer tratando aqui embaixo também
    	if(qtdNegative > 0) {
			mediaNegative = sumNegative/qtdNegative;
    	}
    	if(qtdPositive > 0) {
			mediaPositive = sumPositive/qtdPositive;
    	}*/
    	System.out.printf("Average of the positive numbers: %.2f, and negative ones: %.2f", mediaPositive, mediaNegative);
    }
}
/* Nesse exemplo não posso colocar a média fora do loop, pois não posso dividir por 0. */

/* Pode fazer desse jeito tbm
	if(num != 0) {
		if(num > 0) {
   			sumPositive += num;
   			qtdPositive++;
			mediaPositive = sumPositive/qtdPositive;
   		}else if(num < 0) {
   			sumNegative += num;
   			qtdNegative++;
			mediaNegative = sumNegative/qtdNegative;
   		}
	}else {
		System.out.println("Invalid number.");
		i--;
	}
*/