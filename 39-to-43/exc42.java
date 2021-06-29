import java.util.Scanner;

public class exc42 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

		int age, qtdAgeOverTwenty = 0, goodGrade = 0, i;
		float average, grade, sumGrades = 0;

    	for(i=0; i<=29; i++) {
    		System.out.print("Type up your age: ");
    		age = read.nextInt();

    		System.out.print("Type up your score: ");
    		grade = read.nextFloat();

    		sumGrades += grade;

			if(grade >= 0 && grade <= 100 && age > 0) {
				if(grade > 70 && age > 20) {
					goodGrade++;
					qtdAgeOverTwenty++;
				} else if(grade > 70) {
					goodGrade++;
				} else if(age > 20) {
					qtdAgeOverTwenty++;
				}
    		} else {
    			if(age <= 0 && grade < 0 || grade > 100) {
    				System.out.println("Invalid numbers.");
    			}else if(grade < 0 || grade > 100) {
    				System.out.println("Invalid grade.");
    			}else {
    				System.out.println("Invalid age.");
    			}
    			i--;
    		}
		}
		average = sumGrades/i; // valor do "i" é = 30, ele só não percorre lá em cima
    	System.out.printf("Number of students with a final grade over 70: %d, number of students over 20y: %d, and finally average of final grades of the class: %.2f.", goodGrade, qtdAgeOverTwenty, average);
	}
}