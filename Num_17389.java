import java.util.Scanner;

public class Num_17389 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String YESNO = new String();
		YESNO = sc.next();
		sc.close();
		int bonus=0;
		int score=0;
		for(int i=0; i<N; i++) {
			char a = YESNO.charAt(i);
			if(a == 'X') {
				bonus=0;
			}
			else if(a == 'O') {
				score += bonus + (i + 1);
				bonus++;
			}
		}
		System.out.print(score);
	}

}
