package com.examples;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailIDRegex {
	public static void main(String[] args) {
		String emailId1 = "abc@yahoo.com";
		String emailId2 = "abc-100@yahoo.com";
		String emailId3 = "abc.100@yahoo.com";
		String emailId4 = "abc.111@abc.com";
		String emailId5 = "abc-100@abc.net";
		String emailId6 = "abc@1.com";				//"^[a-z]+@[0-9].[a-z]{2,3}"
		String emailId7 = "abc.100@abc.com.au";		//"^[a-z]+[.][0-9a-z]+@[a-z]{2,3}.[a-z]{2,3}.[a-z]{2,3}"
		String emailId8 = "111@gmail.com.com";		//"^[0-9]+[@][a-z]+.[a-z]{2,3}.[a-z]{2,3}"
		String emailId9 = "111+100@gmail.com";		//"^[0-9]+[+][0-9]+[@][a-z]+.[a-z]{2,3}"

		System.out.println(validateEmailId(emailId1));
		System.out.println(validateEmailId(emailId2));
		System.out.println(validateEmailId(emailId3));
		System.out.println(validateEmailId(emailId4));
		System.out.println(validateEmailId(emailId5));
		System.out.println(validateEmailId(emailId6));
		System.out.println(validateEmailId(emailId7));
		System.out.println(validateEmailId(emailId8));
		System.out.println(validateEmailId(emailId9));

	}

	private static boolean validateEmailId(String emailId) {
		String emailregex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*[@][0-9a-zA-Z]+.[a-zA-Z]{2,3}[.][a-z]{2,3}$";
		Pattern pattern = Pattern.compile(emailregex);
		Matcher matcher = pattern.matcher(emailId);
		return matcher.matches();
	}
}
