package com.heraizen.corejava.assessment;

import java.util.Scanner;

public class RegisterationBasedOnAge {

	public static void main(String[] args) {
		String name;
		int  age;
		long phNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the mobile number:");
		phNo = sc.nextLong();
		System.out.println("Enter the age:");
		age = sc.nextInt();
		if (age > 18) {
			System.out.println("Congratulations " + name + " for your successful registration.");
			return;
		}
		System.out.println("Sorry! You need to be at least 18 years old to get membership.");

	}

	

}

