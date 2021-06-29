import java.util.Scanner;

public class exc19 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int age;

    	System.out.print("Type your age: ");
    	age = read.nextInt();

    	if(age < 16) {
    		System.out.print("You're a baby yet.");
    	} else if(age >= 18 && age <= 65) {
    		System.out.print("You have to vote!");
    	} else if(age >= 16 && age < 18 || age > 65) {
    		System.out.print("You can choose, vote or not.");
    	} else {
    		System.out.print("What are you doin'?");
    	}
    }
}