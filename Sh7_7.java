package pr7;

import java.util.*;

public class Sh7_7 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�̷� ���бݰ��� �ý����Դϴ�.");
		HashMap<String , Double> hash = new HashMap<String , Double>();
		for(int i=0; i<5; i++) {
			System.out.print("�̸��� ����>> ");
			String s = sc.next();
			double d = sc.nextDouble();
			hash.put(s, d);
		}
		System.out.print("���л� ���� ���� ���� �Է� >> ");
		Double n = sc.nextDouble();
		
		Set<String> keys = hash.keySet();
		Iterator<String> it = keys.iterator();
		System.out.print("���л� ��� : ");
		while(it.hasNext()) {
			String name = it.next();
			double avg = hash.get(name);
			if(avg >= n) System.out.print(name + " ");
		}
		sc.close();
	}
}
