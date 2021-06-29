import java.util.Scanner;

public class exc30 {

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

    	int function;
    	float salary;
    	String functionWord = "";

    	System.out.print("Type a number: ");
    	function = read.nextInt();
    	System.out.print("Type your salary: ");
    	salary = read.nextFloat();

    	switch(function) {
    		case 1:
    			salary = (salary*0.30f) + salary;
    			functionWord = "Gerente";
    			break;
    		case 2:
    			salary = (salary*0.40f) + salary;
    			functionWord = "Vendedor";
    			break;
    	 	case 3:
    	 		functionWord = "Programador";
    	 		salary = (salary*0.50f) + salary;
    			break;
    		case 4:
    			functionWord = "Motorista";
    			salary = (salary*0.60f) + salary;
    			break;
    		case 5:
    			functionWord = "Vereador";
    			break;
    		case 6:
				functionWord = "Deputado";
    			break;
    		default:
    			System.out.print("Invalid number!");
       }

      System.out.printf("Hi %s, your salary now is R$%.2f.", functionWord, salary);
	}
}