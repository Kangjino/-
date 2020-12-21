import java.util.*;

public class Num_11508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=0;
		int count=0;
		for(int i=N-1; i>=0; i--) {
			sum+= arr[i];
			count++;
			if(count == 3) {
				count =0;
				sum -=arr[i];
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
