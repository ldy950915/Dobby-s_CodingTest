package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class princess_6 {

	public int solution(int n, int k) {
		int answer = 0;
		//offer: in, poll(������ ���Ϲ���) :out 
		Queue<Integer> Q = new LinkedList<Integer>();
		//1~n ���� ť�� ���
		for(int i=1; i<=n; i++) {
			Q.offer(i);
		}
		while(!Q.isEmpty()) {
			for(int i=1;i<k;i++) {
				Q.offer(Q.poll());
			}
			Q.poll();
			if(Q.size() == 1) {
				answer = Q.poll();
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		princess_6 P = new princess_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(P.solution(n, k));
	}

}
