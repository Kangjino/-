import java.util.Scanner;

public class Num_14720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a [] = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int count=0;
		int house=0;
		for(int i=0; i<N; i++) {
			if(house == a[i]) {
				count++;
				house = (house +1) %3;
			}
		}
		System.out.print(count);
	}

}
