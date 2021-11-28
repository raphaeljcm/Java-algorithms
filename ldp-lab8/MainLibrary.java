package edu.newton.ldp.u8.ex1.lab8;

public class MainLibrary {

	public static void main(String[] args) {
		try {
			ControllerLibrary.startLibrarySystem();		
		} catch(Exception err) {
			System.out.println(err.getMessage());
		} finally {
			System.out.println("Thanks for using our system!");
		}
	}
}