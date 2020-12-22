import java.util.*;

public class Num_11048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt();
		int K = sc.nextInt();
		int a[][] = new int[N][K];
		int b[][] = new int[N][K];
		for(int i=0; i<N; i++) {
			for(int j=0; j<K; j++) {
				a[i][j] = sc.nextInt();
				b[i][j] = 0;
			}
		}
		b[0][0] = a[0][0];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<K; j++) {
				if (i==0 && j==0) continue;
			    else if(i==0) b[i][j] = a[i][j] + b[i][j-1];
				else if(j==0) b[i][j] = a[i][j] + b[i-1][j];
				else b[i][j] = a[i][j] + Math.max(b[i-1][j], b[i][j-1]);
				
			}
		}
		int k = b[N-1][K-1];
		System.out.println(k);
		sc.close();
	}

}
