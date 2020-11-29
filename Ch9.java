
import java.util.*;

public class Ch9 {
	static int x;
	static ArrayList<Integer> [] a;
	static boolean[] check;
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int y = sc.nextInt();
		a = new ArrayList[x + 1];
		 
        for (int i = 0; i <= x; i++) {
            a[i] = new ArrayList<>();
        }

		int first =0, second = 0;
		for(int i=0; i<y; i++) {
			first = sc.nextInt();
			second = sc.nextInt();
			a[first].add(second);
		//	a[second].add(first);
		}
		 
		for (int i = 1; i <= x; i++) {
            Collections.sort(a[i]);
        }
		
		
        check = new boolean[x + 1];
        int xxxx= dfs(1);
        System.out.println(xxxx+1);
		
		sc.close();
	}
	
	private static int dfs(int x) {
        if (check[x]) {
            return 0;
        }
        check[x] = true;
        for (int y : a[x]) {
            if (!check[y])
            	count++;
                dfs(y);
        }
        return count;
 
    }
    
}
