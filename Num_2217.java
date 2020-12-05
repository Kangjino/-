import java.util.*;

public class Num_2217 {

	public static int partition(int A[], int p, int r) {
		int x = A[r]; // 기준원소
		int i = p-1; // i는 1구역의 끝지
		for(int j = p; j<r; j++) {
			if(A[j] <= x) {
				i++;
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
				
			}
		}
		int tmp = A[i+1];
		A[i+1] = A[r];
		A[r] = tmp;
		return i+1;
	}
	
	public static void QuickSort(int A[],int  p, int r) {
		if(p<r) {
			int q = partition(A, p, r);
			QuickSort(A, p, q-1);
			QuickSort(A, q+1, r);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int a [] =new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int count=0;
		/*
		while(true) {
			for(int i=0; i<N-1; i++) {
				if(a[i] >a[i+1]) {
					int tmp = a[i];
					a[i] = a[i+1];
					a[i+1] = tmp;
				}
			}
			count++;
			if(count== N-1) break;
		}
		*/
		QuickSort(a, 0, N-1);
		int big=0;
		count=0;
		int count2=0;
		int realbig=0;
		for(int i=N-1; i>-1; i--) {
			count++;
			int tmp = a[i] * count;
			if(tmp > big) {
				big = tmp;
				realbig = a[i];
				count2= count;
			}
		}
		System.out.print(count2*realbig);
	}

}
