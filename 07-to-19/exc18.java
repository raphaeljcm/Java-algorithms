import java.util.Scanner;

public class exc18 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	double salary, newSalary, readjustment;

    	System.out.print("Type your salary: ");
    	salary = read.nextDouble();

    	if(salary < 500) {
    		readjustment = salary*0.15;
    		newSalary = salary+readjustment;

    		System.out.println("Readjustment: R$" + readjustment + " and your new salary is: R$" + newSalary); //15%
    	} else if (salary >= 500 && salary <= 1000) {
    		readjustment = salary*0.10;
    		newSalary = salary+readjustment;

    		System.out.println("Readjustment: R$" + readjustment + " and your new salary is: R$" + newSalary); // 10%
    	} else if (salary > 1000) {
    		readjustment = salary*0.05;
    		newSalary = salary+readjustment;

    		System.out.println("Readjustment: R$" + readjustment + " and your new salary is: R$" + newSalary); // 05%
    	} else {
    		System.out.println("What are you doin'?");
    	}
    }
}