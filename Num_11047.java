import java.util.Scanner;

public class Num_11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		for(int i=N-1; i>-1; i--) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int count=0;
		for(int i=0; i<N; i++) {
			if(K>=a[i]) {
				int div = K/a[i];
				K -= div *a[i];
				count += div;
				if(K ==0) System.out.print(count);
			}
		}
	}

}
