import java.util.Scanner;

public class exc43 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

		String name;
		int i, c, aprovado = 0, reprovado = 0;
		float average, grade, sumGrades = 0, sumGeral = 0, mediaGeral;

    	for(i=0; i<=9; i++) {
    		read = new Scanner(System.in); // Para concertar o Scanner bugado
    		System.out.print("Type up your name: ");
    		name = read.nextLine();

    		for(c=0; c<=2;c++){
    			System.out.print("Type up your 3 grades: ");
    			grade = read.nextFloat();

    			if(grade >= 0) {
    				sumGrades += grade;
    			} else {
    				System.out.println("Type a valid note!");
    				c--;
    			}
    		}

    		if(sumGrades >= 60) {
    			aprovado++;
    			System.out.printf("%s com nota %.2f está aprovado.\n\n", name, sumGrades);
    		} else {
    			reprovado++;
    			System.out.printf("%s com nota %.2f está reprovado.\n", name, sumGrades);
    		}

    		sumGeral += sumGrades;
    		sumGrades = 0;
		}
		mediaGeral = sumGeral/i; // o valor do "i" aqui será 10, pois ele irá sair do for assim
		System.out.printf("Numbers of approved students: %d, failed ones %d, and class' overall average: %.2f", aprovado, reprovado, mediaGeral);
	}
}