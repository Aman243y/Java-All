package fileIO;

import java.io.FileWriter;//import the filewriter class
import java.io.IOException;//import the IOException class to handle errors

public class WirteDemo {

	public static void main(String[] args) {
		try {
			FileWriter myWriter=new FileWriter("D:\\GANPATI.txt");
			myWriter.write("ganpati gele gawala,cahin pade na aamhal,");
			myWriter.close();
			System.out.println("successfully wrote to the file.");
		} catch (IOException e) {
			System.err.println("an error occured.");
			e.printStackTrace();
		}

	}

}
