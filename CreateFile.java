package fileIO;

import java.io.File;
import java.io.IOException;

class CreateFile {

	public static void main(String[] args) {
		File myObj=new File("D:\\GANPATI.txt");
		try {
			if(myObj.createNewFile()) {
				System.out.println("File created: "+ myObj.getName());
				
			}else{
				System.out.println("File already exist.");
			}
		} catch (IOException e) {
			System.out.println("An errir occurred");
			e.printStackTrace();
		}

	}

}
