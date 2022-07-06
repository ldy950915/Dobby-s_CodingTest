package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Body implements Comparable<Body>{
	public int h,w;
	Body(int h, int w) {
		// TODO Auto-generated constructor stub
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) {
		// TODO Auto-generated method stub
		return o.h - this.h;
	}
	
}
public class Ssileumseonsu_1 {

	public int solution(ArrayList<Body> body , int n) {
		int answer = 0;
		Collections.sort(body);
		
		int max = Integer.MIN_VALUE;
		for(Body ob : body) {
			System.out.println(ob.h + " " + ob.w);
			if(ob.w > max) {
				max = ob.w;
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ssileumseonsu_1 S = new Ssileumseonsu_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Body> arr = new ArrayList<Body>();
		
		for(int i =0;i<n;i++) {
			int h = sc.nextInt();//Å°
			int w = sc.nextInt();//¸ö¹«°Ô
			arr.add(new Body(h, w));
		}
		
		System.out.println(S.solution(arr, n));
	}

}
