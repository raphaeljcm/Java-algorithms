package edu.newton.ldp.u8.ex1.lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModelLibrary {
	
	public static final String DRIVER = "org.h2.Driver";
	public static final String URL = "jdbc:h2:F:\\Raphael Cardoso\\Newton Cronograma\\3º Período\\Linguagens de Programação\\Aula 02 e códigos\\Banco\\Data\\Users";
	public static final String USER = "root";
	public static final String PW = "";
	
	public static Connection getConnection() throws Exception {
		Connection con = null;
		
		// testing driver 
		Class.forName(DRIVER);

		con = DriverManager.getConnection(URL, USER, PW);
		System.out.println("INFO: Connection well succeed.");

		return con;
	}
	
	static void select(Connection con) throws SQLException {
		var statement = con.createStatement();
		var sql = "SELECT * FROM BOOKS";
		
		var result = statement.executeQuery(sql);
		
		if (result.next() == false) {
			System.out.println("No results found.");
		} else {
			// Processing the sql result
			do { // Iterator
				var id = result.getInt("id");
				var title = result.getString("title");
				var author = result.getString("author");
				var year_publication = result.getInt("year_publication");
				var publisher = result.getString("publisher");
				var category = result.getString("category");

				System.out.println("Book " + id + ": " + title + " - "  + author + " - " + year_publication + " - " 
									+ publisher + " - " + category + ".");
			} while (result.next());

			result.close();
			statement.close();
		}
	}
	
	static void selectByClause(Connection con, String word, String clause) throws SQLException {
		var statement = con.createStatement();
		var sql = "SELECT * FROM BOOKS WHERE " +clause+ " = '" +word+ "'";
		
		var result = statement.executeQuery(sql);
		
		if (result.next() == false) {
			System.out.println("There aren't any books with this " +clause+ ".");
		} else {
			// Processing the sql result
			do { // Iterator
				var id = result.getInt("id");
				var title = result.getString("title");
				var author = result.getString("author");
				var year_publication = result.getInt("year_publication");
				var publisher = result.getString("publisher");
				var category = result.getString("category");

				System.out.println("Books found with this clause: ");
				System.out.println(id + ": " + title + " - "  + author + " - " + year_publication + " - " 
									+ publisher + " - " + category + ".");
			} while (result.next());

			result.close();
			statement.close();
		}
	}
	
	static void insert(Connection con, String title, String author, int year, String publi, String cate) 
				throws SQLException {
		
		var statement = con.createStatement();
		var sql = "INSERT INTO BOOKS (title, author, year_publication, publisher, category) "
				+ "values('" +title+ "', '"+author+"', '"+year+"', '"+publi+"', '"+cate+"')";

		var result = statement.executeUpdate(sql);
		System.out.println("Datas updated: " + result);

		statement.close(); 
	}
	
	static void delete(Connection con, int id) throws Exception {
		var statement = con.createStatement();
		var sql = "DELETE FROM BOOKS WHERE ID = " + id;
		var result = statement.executeUpdate(sql);
		
		if (result == 0) {
			System.out.println("This ID doesn't exist.");
		} else {			
			System.out.println("Datas deleted: " + result);
			statement.close();
		}
	}
	
	static void closeConnection(Connection con) throws SQLException {
		if (con != null && !con.isClosed()) {
			con.close();
			System.out.println("INFO: Connection well finished.");
		} else {
			System.out.println("INFO: Connection non-existen or already finished.");
		}
	}
}