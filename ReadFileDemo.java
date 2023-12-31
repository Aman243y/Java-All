package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {

	public static void main(String[] args) {
		File myObj =new File("D:\\GANPATI.txt");
		try {
			Scanner myReader=new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.err.println("An error occured.");
			e.printStackTrace();
		}

	}

}
