package delnex4d;

import java.util.ArrayList;

public class Authors {
	String Name;
	int Age;
	String Gender;
	ArrayList<Books> books = new ArrayList<>();
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public ArrayList<Books> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Books> books) {
		this.books = books;
	}
	public Authors(String name, int age, String gender, ArrayList<Books> books) {
		super();
		Name = name;
		Age = age;
		Gender = gender;
		this.books = books;
	}
	@Override
	public String toString() {
		return "Author [Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", Books=" + books + "]";
	}
	
}
