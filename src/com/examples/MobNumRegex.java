package com.examples;

public class MobNumRegex {
	
	public static void main(String[] args) {
		String[]  strNumbers = {
				"+919856370256",		//"^[+91\\[6-9]+[0-9]{9}$";
				"8756324586",
				"9988776646",			//"^[+91]?[6-9]+[0-9]{9}$"
				"0215-263584"			//"^[0-6]{4}[-][0-9]{6}$";
				};
		String mobPATTERN = "^[+91\\[6-9]+[0-9]{9}$";
		for(String number : strNumbers) {
			System.out.println(number + " => " + number.matches(mobPATTERN));
		}
	}
}
