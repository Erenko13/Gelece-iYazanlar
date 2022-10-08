package odevbir;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class OdevBirSoruBir {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		ArrayList<Character> liste = new ArrayList<>();
		
		System.out.print("Kelime: ");
		String input = myObj.nextLine();
		int count=0;
		for (int i = 0; i < input.length(); i++) {
			for(int j=i+1; j < input.length(); j++) {
				if(input.charAt(i)==input.charAt(j))
				{
					count++;
				}
			
			}
			 
			String temp_arr[] = input.split(Character.toString(input.charAt(i)));
			System.out.println(Arrays.toString(temp_arr)); 
			String final=temp_arr[0]+temp_arr[1];
			System.out.println(input.getClass()); 
		}

}
}
