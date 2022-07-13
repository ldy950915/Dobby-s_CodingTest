package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Wtime implements Comparable<Wtime>{
	public int time;
	public char state; //갔는지 왔는지 저장
	
	Wtime(int time, char state){
		this.time = time;
		this.state = state;
	}
	
	@Override
	public int compareTo(Wtime o) {
		if(this.time == o.time) return this.state - o.state;	//시간이 같을 경우 state정렬
		else return this.time-o.time;
	}	
}
public class Wedding_3 {

	public int solution(ArrayList<Wtime> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt=0;
		for(Wtime w : arr) {
			if(w.state == 's') {
				cnt++;
			}else {
				cnt--;
			}
			answer = Math.max(answer, cnt);
		}	
		return answer;
	}
	
	public static void main(String[] args) {
		Wedding_3 W = new Wedding_3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Wtime> arr = new ArrayList<Wtime>();
		for(int i=0;i<n;i++) {
			int sT = sc.nextInt();
			int eT = sc.nextInt();
			arr.add(new Wtime(sT, 's'));
			arr.add(new Wtime(eT, 'e'));
		}
		System.out.println(W.solution(arr));
	}
}
