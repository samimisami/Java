import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReaderExtension {

	public String setFileDirectory() {
		
		System.out.println("Please enter the directory of the file that needs to be read;\nExample:'C:\\\\Users\\\\FirstUser\\\\Desktop\\\\JavaLogging.txt'");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		scan.close();
		
		return userInput;
	}	
	
	public ArrayList<String> readWords(String directoryFile) {
		
		ArrayList<String> lines=new ArrayList<>();
		
		try {
	    	Scanner scan = new Scanner(new File(directoryFile));
	        while (scan.hasNext()) {
	        	lines.add(scan.nextLine());
	        }
	        scan.close();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} 
//		catch (IOException e) {
//			System.out.println("Exception: " + e.getMessage());
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			System.out.println("Exception: " + e.getMessage());
//			e.printStackTrace();
//		}
		
		return lines;
	}

	public String readLineAt(ArrayList<String> arrayListString, int i) {
		
		return arrayListString.get(i);
	}


}
