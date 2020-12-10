package prac7;

import java.util.*;

public class Yh7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v= new Vector<Integer>();
		
		int avg=0;
		while(true) {
			System.out.println("강수량 입력 (0입력시 종료)>> ");
			int n = sc.nextInt();
			if(n==0) break;
			v.add(n);
			for(int i=0; i<v.size(); i++) {
				avg += v.get(i);
				System.out.print(avg + " ");
			}
			System.out.println((double)(avg/v.size()));
			avg=0;
		}
	}

}
