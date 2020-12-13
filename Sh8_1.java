package prac08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Sh8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		File f = new File("c:\\temp\\phone.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String s = sc.nextLine();
				if(s.length() == 0) break;
				if(s.equals("그만")) break;
				fw.write(s + "\r\n");
			}
			System.out.println(f.getPath() + "에 저장하였습니다.");
			sc.close();
			fw.close();
		}
		catch(IOException e) {
			System.out.println("파일 저장 오류");
		}
		
	}

}
