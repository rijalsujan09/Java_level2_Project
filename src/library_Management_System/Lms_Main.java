package library_Management_System;

import java.util.Deque;
import java.util.LinkedList;

public class Lms_Main {

	public static void main(String[] args) {

		String Book[] = { "Maths", "physic", "Chemestry", "Biology", "Nepali", "computer" };

		Deque<String> myBooks = new LinkedList<>();

		for (int i = 0; i < Book.length; i++) {
			myBooks.offer(Book[i]);
		}
		System.out.println(myBooks);

		System.out.println("Testing Work");

//		testing java  testing java

	}

}
