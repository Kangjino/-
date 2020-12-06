import java.util.Scanner;

public class Num_1010 {
	
	public static double factorial(double n) {
		if(n==0) return 1;
		if(n==1) return 1;
		double sum =0;
		sum = factorial(n-1) * n;
		return sum;
	}
	
	
	public static double bridge(double a, double b) {
		double sum=0;
		sum = factorial(b) / (factorial(a) * factorial(b-a));
		return sum;
	}
	public static void main(String args[] ) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		double a[] = new double[N];
		double b[] = new double[N];
		double c[] = new double[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextDouble();
			b[i] = sc.nextDouble();
		}
		sc.close();
		for(int i=0; i<N; i++) {
			c[i] = bridge(a[i], b[i]);
			System.out.println((int)(c[i]+0.1));
		}
		
	}
	
}
