import java.util.Scanner;

public class Num_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a [] =new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int count=0;
		while(true) {
			for(int i=0; i<N-1; i++) {
				if(a[i] < a[i+1]) {
					int tmp = a[i];
					a[i] = a[i+1];
					a[i+1] = tmp;
				}
			}
			count++;
			if(count== N-1) break;
		}
		
		
		int time=0;
		for(int i=0; i<N; i++) {
			time += (i+1) * a[i];
		}
		System.out.print(time);
	}

}
