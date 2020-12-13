package prac08;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Sh8_3 {

	public static void main(String[] args) {
		File f = new File("c:\\windows\\system.ini");
		FileReader fr;
		int c;
		try {
			fr = new FileReader(f);
			while((c=fr.read()) != -1) {
				if(c >= 'a' || c <= 'z' ) {
					c= Character.toUpperCase(c);
				}
				System.out.print((char)c);
				
			}
			fr.close();
		}
		
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
