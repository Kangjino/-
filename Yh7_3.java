package prac7;

import java.util.*;

public class Yh7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("나라 이름과 인구를 입력하세요: (예 : Korea 5000");
		Scanner sc= new Scanner(System.in);
		HashMap<String, String> h = new HashMap<String, String>();
		while(true) {
			String a, b;
			a = sc.next();
			if(a.equals("그만")) break;
			b = sc.next();
			h.put(a, b);
		}
		
		while(true) {
			String a = sc.next();
			if(a.equals("그만")) break;
			String kor = h.get(a);
			if(kor == null) System.out.println(a + " 나라는 없습니다.");
			else System.out.println(a + "의 인구는" + kor);
		}
		sc.close();
	}

}
