package prac7;

import java.util.*;

public class Yh7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수(-1이 입력될 때까지) >> " );
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			int n = sc.nextInt();
			if(n==-1) break;
			v.add(n);
		}
		int big = v.elementAt(0);
		for(int i=1; i < v.size(); i++) {
			if(big < v.elementAt(i)) big = v.elementAt(i);
		}
		System.out.println(big);
		sc.close();
	}

}
