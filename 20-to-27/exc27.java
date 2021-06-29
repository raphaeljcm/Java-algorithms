import java.util.Scanner;

public class exc27 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	String name, specialty = "";
    	int age;

    	System.out.println("Hi, please enter with your name and age: ");
    	name = read.nextLine();
    	age = read.nextInt();

    	if(age <= 0) {
    		System.out.print("Please, type a correct age.");
    		return;
    	}
    	if(age <= 12) {
    		specialty = "Pediatrics";
    	}else if(age > 12 && age <= 59) {
    		specialty = "General clinic";
    	}else if(age > 60) {
    		specialty = "Geriatrics";
    	}else {
    		System.out.print("Error, try again");
    	}
    	System.out.print("Hello " +name+ " your age is " +age+ " so you have to go in " +specialty+ ". Thank you, take care.");
    }
}