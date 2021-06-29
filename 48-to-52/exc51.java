import java.util.Scanner;

public class exc51 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

		String name;
		int i = 0, c, aprovado = 0, reprovado = 0;
		float average, grade, sumGrades = 0, sumGeral = 0, mediaGeral;

    	do {
    		read = new Scanner(System.in); // Para concertar o Scanner bugado
    		System.out.print("Type up your name: ");
    		name = read.nextLine();

			if(!name.equals("FIM") && !name.equals("fim")) {

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
	    			i++;
	    			System.out.printf("%s com nota %.2f está aprovado.\n\n", name, sumGrades);
	    		} else {
	    			reprovado++;
	    			i++;
	    			System.out.printf("%s com nota %.2f está reprovado.\n\n", name, sumGrades);
	    		}
			}

    		sumGeral += sumGrades;
    		sumGrades = 0;

		} while(!name.equals("FIM") && !name.equals("fim"));

		mediaGeral = sumGeral/i;
		System.out.printf("Numbers of approved students: %d, failed ones %d, and class' overall average: %.2f", aprovado, reprovado, mediaGeral);
	}
}