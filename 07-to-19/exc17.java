import java.util.Scanner;

public class exc17 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int age;

    	System.out.print("Type your age: ");
    	age = read.nextInt();

    	if(age >= 5 && age <= 12) {
    		System.out.print("Your category is Childish.");
    	} else if (age >= 13 && age <= 17) {
    		System.out.print("Your category is Juvenile.");
    	} else if (age >= 18 && age <= 25) {
    		System.out.print("Your category is Professional.");
    	} else {
    		System.out.print("Your category is Others.");
    	}
    }
}