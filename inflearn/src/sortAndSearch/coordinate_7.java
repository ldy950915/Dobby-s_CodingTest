package sortAndSearch;

import java.util.*;

class Point implements Comparable<Point> {
	public int x ,y ;
	Point(int x, int y){		
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) {	//x좌표가 같으면
			return this.y-o.y;
		}else {
			return this.x-o.x;
		}
	}
}
public class coordinate_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<Point>();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for(Point o : arr) {
			System.out.println(o.x+" "+o.y);
		}
	}

}
