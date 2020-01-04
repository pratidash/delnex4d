package delnex4d;

import java.util.ArrayList;

public class BookAuthor {
	 public static void main(String[] args) {
		Books B1 = new Books("Rabbit", "Penguin", 18000);
		Books B2 = new Books("Duck", "Arihant", 19000);
		Books B3 = new Books("Catalyst", "Sun", 14000);
		Books B4 = new Books("Cannibal", "Islo", 25000);
		ArrayList<Books> al = new ArrayList<>();
		al.add(B1);
		al.add(B2);
		al.add(B3);
		al.add(B4);
		Authors A1 = new Authors("Raj", 35, "Male", al);
		System.out.println(A1);
	}
}
