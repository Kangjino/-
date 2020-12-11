package pr7;

import java.util.*;

public class Sh7_7 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("미래 장학금관리 시스템입니다.");
		HashMap<String , Double> hash = new HashMap<String , Double>();
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점>> ");
			String s = sc.next();
			double d = sc.nextDouble();
			hash.put(s, d);
		}
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		Double n = sc.nextDouble();
		
		Set<String> keys = hash.keySet();
		Iterator<String> it = keys.iterator();
		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			String name = it.next();
			double avg = hash.get(name);
			if(avg >= n) System.out.print(name + " ");
		}
		sc.close();
	}
}
