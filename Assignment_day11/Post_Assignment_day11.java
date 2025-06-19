package Project;


	import java.sql.Connection;
	import java.sql.*;
	import java.util.Scanner;

	public class Post_Assignment_day11 {

	   
	    static final String URL = "jdbc:mysql://localhost:3308/test_db";
	    static final String USER = "root";
	    static final String PASSWORD = "";
	    
	    
	    static Connection connection = null;
	    static Statement statement = null;
	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        try {
	            
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            statement = connection.createStatement();
	            
	            while (true) {
	               
	                System.out.println("\n----- Menu -----");
	                System.out.println("1. Insert a Record");
	                System.out.println("2. Delete a Record");
	                System.out.println("3. Retrieve All Records");
	                System.out.println("4. Update a Record");
	                System.out.println("5. Exit");
	                System.out.print("Enter your choice: ");
	                int choice = scanner.nextInt();
	                
	                switch (choice) {
	                    case 1:
	                        insertRecord();
	                        break;
	                    case 2:
	                        deleteRecord();
	                        break;
	                    case 3:
	                        retrieveRecords();
	                        break;
	                    case 4:
	                        updateRecord();
	                        break;
	                    case 5:
	                        System.out.println("Exiting...");
	                        connection.close();
	                        System.exit(0);
	                        break;
	                    default:
	                        System.out.println("Invalid choice! Please choose a valid option.");
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    
	    private static void insertRecord() {
	        System.out.print("Enter Student ID: ");
	        int id = scanner.nextInt();
	        System.out.print("Enter Student Name: ");
	        String name = scanner.next();
	        System.out.print("Enter Student Age: ");
	        int age = scanner.nextInt();
	        
	        String query = "INSERT INTO student (id, name, age) VALUES (" + id + ", '" + name + "', " + age + ")";
	        try {
	            statement.executeUpdate(query);
	            System.out.println("Record inserted successfully.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    
	    private static void deleteRecord() {
	        System.out.print("Enter Student ID to delete: ");
	        int id = scanner.nextInt();
	        
	        String query = "DELETE FROM student WHERE id = " + id;
	        try {
	            int rowsAffected = statement.executeUpdate(query);
	            if (rowsAffected > 0) {
	                System.out.println("Record with ID " + id + " deleted successfully.");
	            } else {
	                System.out.println("No record found with ID " + id);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    
	    private static void retrieveRecords() {
	        String query = "SELECT * FROM student";
	        try {
	            ResultSet resultSet = statement.executeQuery(query);
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                int age = resultSet.getInt("age");
	                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	   
	    private static void updateRecord() {
	        System.out.print("Enter Student ID to update: ");
	        int id = scanner.nextInt();
	        
	        System.out.print("Enter new name for Student: ");
	        String newName = scanner.next();
	        System.out.print("Enter new age for Student: ");
	        int newAge = scanner.nextInt();
	        
	        String query = "UPDATE student SET name = '" + newName + "', age = " + newAge + " WHERE id = " + id;
	        try {
	            int rowsAffected = statement.executeUpdate(query);
	            if (rowsAffected > 0) {
	                System.out.println("Record with ID " + id + " updated successfully.");
	            } else {
	                System.out.println("No record found with ID " + id);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

	
		



