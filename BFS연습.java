import java.util.*;
import java.io.*;
// 20174246 강진호입니다.


public class Ch11 {
	static int x;
	static ArrayList<Integer> [] a;
	static boolean[] check;
	static int count=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt(); // 노드받고
		int y = scan.nextInt(); // 간선받고
		a = new ArrayList[x + 1];
		 
        for (int i = 0; i <= x; i++) {
            a[i] = new ArrayList<>();
        }
        int start, last;
        start = scan.nextInt();
        last = scan.nextInt();
		int  second = 0;
		int first =0;
		for(int i=0; i<y; i++) {
			first = scan.nextInt();
			second = scan.nextInt();
			a[first].add(second);
			a[second].add(first);
		}
		 
		for (int i = 1; i <= x; i++) {
            Collections.sort(a[i]);
        }
		
		
        check = new boolean[x + 1];
        int xx= bfs(start, last);
        //System.out.println(xx+1);
        StringBuffer sb = new StringBuffer();
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        if(xx>2) {
        	for(int i=1; i<xx; i++) {
        		bf.write("아는 사람의 ");
			}
        	bf.write("아는 사람");
        }
        else if(xx == 1) bf.write("아는 사람");
		else if(xx==0) bf.write("모르는 사람");
		System.out.print(sb);
		scan.close();
		bf.flush();
	}
	
	private static int bfs(int start, int last) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		if (check[x]) {
			return 0;
		}
		
		while(!queue.isEmpty()) {
			int tmp  = queue.poll();
			//System.out.print(tmp + " ");
			
			for(int i=0; i<a[start].size(); i++) {
				if(!check[a[start].get(i)]) {
					queue.offer(a[start].get(i));
					count++;
					if(a[start].get(i) == last) return count;
					check[x] = true;
				}
			}
		}
		
		return count;
	}
}
	/*
	private static int dfs(int x, int x2) {
        if (check[x]) {
            return 0;
        }
        check[x] = true;
        for (int y : a[x]) {
            if (!check[y])
            	count++;
            if(x == x2) return count;
                dfs(y, x2);
        }
        return 0;
 
    }
*/

/*

4 2
1 2
3 4
1 4

4 3
1 2
1 3
3 4
2 4



*/