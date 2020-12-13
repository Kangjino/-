package prac08;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Sh8_4 {

	public static void main(String[] args) {
		File f = new File("c:\\windows\\system.ini");
		try {
			Scanner sc= new Scanner(new FileReader(f));
			int num=1;
			while(sc.hasNext()) {
				String s = sc.nextLine();
				System.out.print(num + ":" + s);
				System.out.println();
				num++;
			}
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
