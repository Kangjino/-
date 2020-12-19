import java.util.*;

public class Num_16194 {

	public static int a[];
	public static int b[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		a = new int[N+1];
		b = new int[N+1];
		for(int i=1; i<N+1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(X(N));
		sc.close();
		
		
	}
	
	public static int X(int N) {
		
		if(N==0) return 0;
		if(b[N] > 0) return b[N];
		int count=99999;
		for(int i=1; i<=N; i++) {
			if(N-i>=0) {
				int tmp = a[i] + X(N-i);
				count = Math.min(count, tmp);
			}
		}
		b[N] = count;
		return b[N];
	}

}
