
import java.util.*;

public class Ch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[x + 1];
		 
        for (int i = 0; i <= x; i++) {
            a[i] = new ArrayList<>();
        }

		int first =0, second = 0;
		for(int i=0; i<y; i++) {
			first = sc.nextInt();
			second = sc.nextInt();
			a[first].add(second);
			a[second].add(first);
		}
		for(int i=1; i<=x; i++) {
			for(int j=0; j<a[i].size(); j++ ) {
				int name = a[i].get(j);
				System.out.print(name + " ");
			}
			System.out.println();
		}
	
		
		System.out.println();
		sc.close();
	}

}
