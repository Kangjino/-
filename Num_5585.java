import java.util.Scanner;

public class Num_5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		N = 1000 - N;
		int div;
		int count=0;
		if(N>=500) {
			div = N/500;
			N -= div *500;
			count += div;
			if(N ==0) System.out.print(count);
		}
		if(N>=100) {
			div = N/100;
			N -= div *100;
			count += div;
			if(N ==0) System.out.print(count);
		}
		if(N>=50) {
			div = N/50;
			N -= div *50;
			count += div;
			if(N ==0) System.out.print(count);
		}
		if(N>=10) {
			div = N/10;
			N -= div *10;
			count += div;
			if(N ==0) System.out.print(count);
		}
		if(N>=5) {
			div = N/5;
			N -= div *5;
			count += div;
			if(N ==0) System.out.print(count);
		}
		if(N>=1) {
			div = N/1;
			N -= div *1;
			count += div;
			if(N ==0) System.out.print(count);
		}
	}

}
