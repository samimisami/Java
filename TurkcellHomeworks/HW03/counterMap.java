
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class counterMap {

	public static void main(String[] args) {
		
		System.out.println("Please enter a string;");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		scan.close();
		
		LinkedHashMap<Character, Integer> charsUserInput=new LinkedHashMap<>();
		
		for (int i=0; i<userInput.length(); i++ ) {
			
			if (charsUserInput.containsKey(userInput.charAt(i))) {
				Integer buffer=charsUserInput.get(userInput.charAt(i));
				buffer=buffer+1;
				charsUserInput.replace(userInput.charAt(i), buffer);
			} else {
				charsUserInput.put(userInput.charAt(i),1);
			}
		}
		System.out.println(charsUserInput);
		
		String desiredOutput="";
		
		Set<Character> elements = charsUserInput.keySet();
		
		for (Character character : elements) {
//			System.out.println(character);
//			System.out.println(charsUserInput.get(character));
			desiredOutput=desiredOutput+character+charsUserInput.get(character);
		}
		System.out.println(desiredOutput);
	}
}
