package prac7;

import java.util.*;

public class Yh7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �̸��� �α��� �Է��ϼ���: (�� : Korea 5000");
		Scanner sc= new Scanner(System.in);
		HashMap<String, String> h = new HashMap<String, String>();
		while(true) {
			String a, b;
			a = sc.next();
			if(a.equals("�׸�")) break;
			b = sc.next();
			h.put(a, b);
		}
		
		while(true) {
			String a = sc.next();
			if(a.equals("�׸�")) break;
			String kor = h.get(a);
			if(kor == null) System.out.println(a + " ����� �����ϴ�.");
			else System.out.println(a + "�� �α���" + kor);
		}
		sc.close();
	}

}
