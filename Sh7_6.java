package pr7;

import java.util.*;

class Location {
	String name, x, y;
	public Location(String name, String x, String y) {
		this.name =name; this.x=x; this.y=y;
	}
	public void show() {
		System.out.println(name + "(이)라는 도시의 위도는 " + x + "이며 경도는 " + y + "입니다.");
	}
}

public class Sh7_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		HashMap<String, Location> hash = new HashMap<String, Location>();
		System.out.println("도시, 경도, 위도를 입력하세요.");
		String sp[] = new String[3];
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String s= sc.nextLine();
			sp = s.split(",");
			hash.put(sp[0], new Location(sp[0], sp[1], sp[2]));
		}
		Set<String> keys = hash.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String s= it.next();
			Location  a = hash.get(s);
			a.show();
		}
		int count=0;
		@SuppressWarnings("unused")
		String key=null;
		while(true) {
			System.out.print("도시 이름 >> ");
			String s = sc.next();
			if(s.equals("그만")) break;
			for(int i=0; i<hash.size(); i++) {
				if(hash.get(s)==null) count++;
				else count=0; key =s;
			}
			if(count ==4) {
				System.out.println(s + "는 없습니다.");
			}
			if(count !=4) {
				Location a = hash.get(s);
				a.show();
			}
			count=0;
			
		}
		
		sc.close();	
	}

}
