import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ReaderExtension myReader=new ReaderExtension();
		
		String directoryFile = myReader.setFileDirectory();
//		System.out.println(directoryFile);
		
		ArrayList<String> lines=myReader.readWords(directoryFile);
		
//		for (String string : lines) {
//			System.out.println(string);
//		}
		
		String desiredOutput=myReader.readLineAt(lines, 0);
		System.out.println(desiredOutput);
		String desiredOutput2=myReader.readLineAt(lines, 2);
		System.out.println(desiredOutput2);
		
		// 0_outputExample.png
	}

}
