import java.util.Scanner;

public class Ch17 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		int c[] = new int[N];
		int button[] = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i]= a[i] + b[i];
			button[i] = 0;
		}
		sc.close();
		for(int j=0; j<N; j++) {
		for(int i=0; i<N-1; i++) {
			if((c[i] > c[i+1]) || ((c[i]== c[i+1]) && (a[i] > a[i+1]))) {
				int tmp = c[i]; c[i] = c[i+1]; c[i+1] = tmp;
				tmp = a[i]; a[i] = a[i+1]; a[i+1] = tmp;
				tmp = b[i]; b[i] = b[i+1]; b[i+1] = tmp;
			}
		}
		}
		/*
		for(int i=0; i<N; i++) {
			System.out.println("시작은 " + a[i] + "끝나는시간은" + c[i]);
		}
		*/
		int count=0;
		int last=-999;
		for(int i=0; i<N; i++) {
			if(a[i] >= last) {
				last = c[i];
				count++;
			}
		}
		System.out.print(count);
	}

}
/*
10
1 2
2 3
4 9
5 4
3 12
6 1
15 2
7 2
8 1
*/
