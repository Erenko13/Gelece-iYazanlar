package odevbir;

import java.util.ArrayList;
import java.util.Scanner;

public class OdevBirSoruIki {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		ArrayList<Character> liste = new ArrayList<>();
		
		
		System.out.print("Kelime: ");
		String input = myObj.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if (!liste.contains(input.charAt(i))) {
				liste.add(input.charAt(i));
			}
		}
		System.out.println(liste.toString().replace(",","").replace("[","").replace("]","").replace(" ",""));
	}
}