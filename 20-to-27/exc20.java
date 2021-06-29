import java.util.Scanner;

public class exc20 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

		int sideA, sideB, sideC;

		System.out.println("Enter with the sides of the triangle:");
		sideA = read.nextInt();
		sideB = read.nextInt();
		sideC = read.nextInt();

		if(sideA < (sideB+sideC) && sideB < (sideA+sideC) && sideC < (sideA+sideB)) {
			if(sideA == sideB && sideA == sideC && sideB == sideC) {
			System.out.print("Its triangle is equilateral.");
			} else if(sideA == sideB || sideB == sideC || sideA == sideC) {
			System.out.print("Its triangle is isosceles.");
			} else if(sideA != sideB && sideA != sideC && sideB != sideC) {
			System.out.print("Its triangle is scalene.");
			} else{
			System.out.print("I have no idea what's going on.");
			}
		}else {
			System.out.print("It isn't a triangle.");
		}
    }
}