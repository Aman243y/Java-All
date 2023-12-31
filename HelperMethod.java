package fileIO;

import java.io.File;

public class HelperMethod {

	public static void main(String[] args) {
		File myObj=new File("D:\\GANPATI.txt");
		if(myObj.exists()) {
			System.out.println("File name:" +myObj.getName());
			System.out.println("Absolute path:"+myObj.getAbsolutePath());
			System.out.println("Writeable:" + myObj.canWrite());
			System.out.println("Readable:" + myObj.canRead());
			System.out.println("File size in byte:" +myObj.length());
		}else {
			System.out.println("The does not exist.");
		}

	}

}
