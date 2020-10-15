package bullsAndCows;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String secretCode = "9305";
		String input = sc.nextLine();
		String res = bullCow(secretCode, input);
		System.out.println("Gradle: " + res + " The secret code is " + secretCode + ".");
	}
	
	static String bullCow(String secretCode, String input) {
		int cow = 0, bull = 0;
		String secretCodeNew = "", inputNew = ""; 
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == secretCode.charAt(i)) 
				bull++;
			else {
				secretCodeNew += secretCode.charAt(i);
				inputNew += input.charAt(i);
			}
		}
		for (int i = 0; i < inputNew.length(); i++) {
			for (int j = 0; j < secretCodeNew.length(); j++) {
				if(inputNew.charAt(i) == secretCodeNew.charAt(j))
					cow++;
			}
		}
		String res1 = "", res2 = "";
		res1 = bull + " bull(s)";  
		res2 = cow + " cow(s)";

		if(bull != 0 && cow == 0)
			return res1 + ".";
		if(bull == 0 && cow != 0)
			return res2 + ".";
		if(bull == 0 && cow == 0)
			return "None.";
		return res1 + " and " + res2 + ".";
	}
}
