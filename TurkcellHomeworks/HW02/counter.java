
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please enter a string;");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		scan.close();
		
		ArrayList<Character> charsUserInput=new ArrayList<>();
		
		for (int i=0; i<userInput.length(); i++ ) {
			charsUserInput.add(userInput.charAt(i));
		}
		
		System.out.println(charsUserInput);
		
		String desiredOutput="";
		for (Character character : charsUserInput) {
			
			Character charFirst=character;
			int uniqueCounter=0;
			boolean doesItContain = false;
			
			for (Character character2 : charsUserInput) {
				if (charFirst==character2) {
					// increment of uniqueCounter
					uniqueCounter=uniqueCounter+1;
				} else {
					// do nothing
				}
				if (desiredOutput.contains(character.toString())) {
					// do nothing
				} else {
					// add the character to the string
					doesItContain=true;
				}
			}
			if (doesItContain==true) {
				// add counter to the string
				desiredOutput=desiredOutput+character+uniqueCounter;
			} else {
				// do nothing
			}
		}
		System.out.println(desiredOutput);
	}
}
