package prac7;

import java.util.*;

public class Yh7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		for(int i=0; i<6; i++) {
			String n = sc.next();
			a.add(n);
		}
		double sum = 0.0;
		for(int i=0; i<a.size(); i++) {
			String b= a.get(i);
			if(b.equals("A")) sum += 4;
			else if(b.equals("B")) sum += 3;
			else if(b.equals("C")) sum += 2;
			else if(b.equals("D")) sum += 1;
			else if(b.equals("F")) sum += 0;
		}
		System.out.println(sum/6);
		sc.close();
	}

}
