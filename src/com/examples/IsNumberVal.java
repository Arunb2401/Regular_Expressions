package com.examples;

import javax.swing.JOptionPane;

public class IsNumberVal {
	public static void main(String[] args) {
		String input = "09606557704";

		if (valphone(input)) {
			JOptionPane.showMessageDialog(null, "Valid");
		} else {
			JOptionPane.showMessageDialog(null, "Invalid");
		}
	}

	public static boolean valphone(String in) {
		return in.charAt(0) == '0' && in.charAt(1) == '9' && in.length() == 11 && in.matches("[0-9]+");
	}
}
