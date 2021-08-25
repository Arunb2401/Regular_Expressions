package com.examples;

public class PasswordRegex {
public static void main(String[] args) {
		String[]  strPasswords = {
				"Arun&1234",		//"^[A-Z][a-z]+[# @ $ &][0-9]+$";
				"Arun_b#1234",		//"^[A-Z][a-z]+[_][a-z]+[@][0-9]+$";
				"arun_AB@012-34",	//"^[a-z]+[_][A-Z]+[@][0-9]+[-][0-9]+$";
				"*run_b12345",		//"^[@ * # $ &][a-z]+[_][a-z]{1}[1-5]{5}$";
				"1arunB@2"	,		//Secure Password requirements - 
				"Aaaaagvh&1234"		//"^[A-Z]{1}[a-z]{3,}[# @ $ &][0-9]+$";
				};
		String passPATTERN = "^[0-9]{1}[a-z]{4}[A-Z]{1}[! @ # & ( ) .]{1}[0-9]{1}$";
		for(String number : strPasswords) {
			System.out.println(number + " => " + number.matches(passPATTERN));
		}
	}
}
