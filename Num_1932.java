import java.util.*;

public class Num_1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int a[][] = new int[N+1][N+1];
		for(int i=0; i<N+1; i++) {
			for(int j=0; j<N+1; j++) {
				a[i][j] = 0;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i+1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	
		sc.close();
		int b[][] = new int[N+1][N+1];
		b[0][0] = a[0][0];
		for(int i=1; i<N; i++) {
			for(int j=0; j<i+1; j++) {
				if(j!=0) {
					b[i][j] =  a[i][j] + Math.max(b[i-1][j], b[i-1][j-1]);
				}
				else if(j==0) b[i][j] =  a[i][j] + b[i-1][j];
			}
		}
		int big=0;
		for(int i=0; i<N; i++) {
			if(big < b[N-1][i]) big = b[N-1][i];
		}
		System.out.println(big);
		
	}

}
