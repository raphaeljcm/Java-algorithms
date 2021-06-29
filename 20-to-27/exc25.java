import java.util.Scanner;

public class exc25 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int age;

    	System.out.print("Enter with your age: ");
    	age = read.nextInt();

    	if(age == 0) {
    		System.out.print("Beat it");
    	}else if(age < 18) {
    		System.out.print("You're underage.");
    	}else if(age >= 18 && age <= 65) {
    		System.out.print("You're of legal age.");
    	}else if(age > 65) {
    		System.out.print("You're elderly.");
    	}else {
    		System.out.print("What the hell are you?");
    	}
    }
}