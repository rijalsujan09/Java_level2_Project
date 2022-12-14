package library_Management_System;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("\n\n \t\t\t\t Welcome to Library  Management System\t\t\n\n");

		System.out.println("Enter username::");
		String username = scan.next();

		System.out.println("Enter password");
		String password = scan.next();
		if (username.equals("OurLibrary") && (password.contentEquals("Allbooks123@"))) {
			System.out.println(" Login Successfull.You can proceed further.");
		} else {
			System.out.println("Wrong Inputs.Try again!!");
		}

		while (true) {
			// Librarian functionalities
			System.out.println("1. Add Students");
			System.out.println("2. Add Books to library ");
			System.out.println("3. View All users");
			System.out.println("4. Issue books for Students");
			System.out.println("5. Entry of return books");
			System.out.println("6. Remove books from library");
			System.out.println("7. Exit from system");
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			UserType type = null;
			while (true) {
				System.out.println("1.librarian\t 2.Student");
				System.out.println("Choose the user type.");
				int userChoice = scan.nextInt();
				if (userChoice == 1) {
					type = UserType.lIBRARIAN;
				} else if (userChoice == 2) {
					type = UserType.STUDENT;
				} else {
					System.out.println("Invalid option.");
					continue;
				}
				break;
			}
			if (choice == 1) {
				// Add Students

				System.out.println("Enter first name::");
				String firstName = scan.next();

				System.out.println("Enter last name::");
				String lastName = scan.next();
				continue;
			} else if (choice == 2) {
				// Add books to library
				System.out.println("Enter serial number of book:");
				int sNo = scan.nextInt();
				System.out.println("Enter book name: ");
				String bookname = scan.next();
				System.out.println("Enter Author Name:");
				String Author = scan.next();
				System.out.println("Enter quantity of book: ");
				int quantity = scan.nextInt();

			} else if (choice == 3) {
				// View all users/Students
			}
			continue;

		}

	}
}
