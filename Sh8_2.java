package prac08;

import java.io.*;

public class Sh8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("c:\\temp\\phone.txt");
		FileReader fw;
		try {
			fw = new FileReader(f);
			int c;
			while((c=fw.read()) != -1) {
				System.out.print((char)c);
			}
			fw.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
