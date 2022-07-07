package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Time implements Comparable<Time>{
	public int s,e;
	Time(int s, int e) {
		// TODO Auto-generated constructor stub
		this.s = s;	//시작
		this.e = e;	//끝
	}
	
	@Override
	public int compareTo(Time t) {	//정렬방법
		// TODO Auto-generated method stub
		if(this.e == t.e) return this.s-t.s; //오른차순
		else return this.e-t.e;	//
	}
	
}
public class MeetingRoom_2 {
	
	public int solution(ArrayList<Time> arr, int n) {
		int answer = 0;
		Collections.sort(arr);	//Comparable 메소드로 자동으로 정렬
		int endTime = 0; //끝나는 시간을 0으로 초기화
		for(Time t : arr) {
			if(t.s >= endTime) {
				answer++;
				endTime = t.e; //진행되기 때문에 t의 endTime을 넣어줌
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeetingRoom_2 M = new MeetingRoom_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<Time>();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Time(x, y));
		}
		System.out.println(M.solution(arr,n));
	}

}
