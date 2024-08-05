package com.project;

import java.util.Scanner;

class User {
	
	private int userId;
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private String city;
	private String gender;
	private String phoneNumber;

	public User(int userId, String emailId, String password, String firstName, String lastName, String city,
			String gender, String phoneNumber) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", emailId=" + emailId + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", city=" + city + ", gender=" + gender + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}

public class Source {

		static User harry = new User(1001, "acb1@gmail.com", "password1", "Harry", "Potter", "Bangalore", "male", "1234567892");
		static User john = new User(1002, "john@gmail.com", "password2", "john", "clavius", "Delhi", "male", "1234567893");
		static User deepthi = new User(1003, "deepti@gmail.com", "password3", "Deepti", "Goyal", "Bangalore", "female", "1234567894");

		public static void getHarry() {
			System.out.println(harry);
		}		
		public static void getJohn() {
			System.out.println(john);
		}
		public static void getDeepti() {
			System.out.println(deepthi);
		}
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			
			switch(name)
			{
			case("harry") : getHarry();
			break;
			case("john") : getJohn();
			break;
			case("deepthi") : getDeepti();
			break;
			
			default : System.out.println("No User Found");
			}			
			
		}
		
	}


