package com.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameRegex {
	public static void main(String[] args) {
		String name1 = "Arun";
		String name2 = "arun";
		String name3 = "ARUN";
		
				System.out.println(validateName(name1));
				System.out.println(validateName(name2));
				System.out.println(validateName(name3));

	}
	
	private static boolean validateName(String name) {
		String nameRegex = "^[A-Za-z]{1,}$";
		Pattern pattern = Pattern.compile(nameRegex);
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
	}
}
