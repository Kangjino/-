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
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String s = sc.nextLine();
				if(s.length() == 0) break;
				if(s.equals("�׸�")) break;
				fw.write(s + "\r\n");
			}
			System.out.println(f.getPath() + "�� �����Ͽ����ϴ�.");
			sc.close();
			fw.close();
		}
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
		
	}

}
