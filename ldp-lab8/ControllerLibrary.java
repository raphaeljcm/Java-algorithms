package edu.newton.ldp.u8.ex1.lab8;

import java.sql.Connection;
import java.util.Scanner;

public class ControllerLibrary {
	
	public static void startLibrarySystem() throws Exception {
		
		int option = 0;
		String clause = "";
		Connection con = null;
		con = ModelLibrary.getConnection();
		var read = new Scanner(System.in);
		
		while(option != 6) {
			System.out.println("");
			LibraryView.showMenu();
			option = Integer.parseInt(read.nextLine());
			
			switch(option) {
			
			case 1: // INSERT
				System.out.println("Title: ");
				var title = read.nextLine();
				System.out.println("Author: ");
				var author = read.nextLine();
				System.out.println("Year of the publication: ");
				var year = read.nextLine();
				System.out.println("Publisher: ");
				var publisher = read.nextLine();
				System.out.println("Category: ");
				var category = read.nextLine();
				
				// workaround to fix scanner "bug"
				var yearInt = Integer.parseInt(year);

				ModelLibrary.insert(con, title, author, yearInt, publisher, category);
	
				break;
			case 2: // SELECT
				ModelLibrary.select(con);
				break;
			case 3: // SELECT BY TITLE
				System.out.println("Please type the title you want to search for:");
				var titleName = read.nextLine();
				clause = "title";
				
				ModelLibrary.selectByClause(con, titleName, clause);
				break;
			case 4: // SELECT BY CATEGORY
				System.out.println("Please type the category you want to search for:");
				var titleCategory = read.nextLine();
				clause = "category";
				
				ModelLibrary.selectByClause(con, titleCategory, clause);
				break;
			case 5: // DELETE
				System.out.println("Please type the ID number to delete a book:");
				var id = read.nextLine();
				
				var idInt = Integer.parseInt(id);
				
				ModelLibrary.delete(con, idInt);
				break;
			case 6: 
				ModelLibrary.closeConnection(con);
				read.close();
			}
		}
	}
}