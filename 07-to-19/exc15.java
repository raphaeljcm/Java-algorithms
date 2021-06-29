import java.util.Scanner;

public class exc15 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	String time1, time2;
    	int gol1, gol2;

    	System.out.print("Type name of team 1: ");
    	time1 = read.nextLine();

    	System.out.print("Type name of team 2: ");
    	time2 = read.nextLine();

    	System.out.println("How many gols did team 1 score? ");
    	gol1 = read.nextInt();

    	System.out.println("How many gols did team 2 score? ");
    	gol2 = read.nextInt();

    	if(gol1 == gol2) {
    		System.out.println("Match draw!");
    	} else if(gol1 > gol2) {
    		System.out.println(time1 +  " won!");
    	} else {
    		System.out.print(time2 +" won!");
    	}
    }
}