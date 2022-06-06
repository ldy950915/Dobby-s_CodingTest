package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//송아지 찾기
public class findCalf_8 {
	int answer = 0;//최소 횟수
	int[] dis = {1,-1,5};//이동
	int[] ch;//방문 체크
	Queue<Integer> Q = new LinkedList<Integer>(); //정수 저장 
	public int BFS(int s, int e) {
		ch = new int[10001]; //문제에서 index크기가 10000이라 명명 되어있음.
		ch[s] = 1; //출발지점은 1~10000까지
		Q.offer(s);	//Q에 출발 지점 초기값 셋팅
		int L = 0;//루트 노드 - 레벨은 0부터
		while(!Q.isEmpty()) { //Q의 값이 있을때만 while문 돌기
			int len = Q.size();//레벨에 있는 원소의 개수
			for(int i =0; i<len; i++) {
				int x = Q.poll();
				System.out.println("x :" + x);
				for(int j=0;j<3;j++) {
					int nx = x+dis[j];
					if(nx==e) return L+1; //부모노드 기준이라서 +1을 해줘야함
					if(nx >1 && nx<=10000 && ch[nx]==0) { //ch[nx] ==0 -> 방문 체크 여부
						ch[nx] = 1; //신규 등록 시 1로 값 넣기
						Q.offer(nx);
					}
				}
			}
			L++;//레벨 증가
		}
		return answer;
	}
	
	public static void main(String[] args) {
		findCalf_8 F = new findCalf_8();
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();	//현수 위치
		int e = in.nextInt(); 	//송아지 위치
		System.out.println(F.BFS(s, e));
	}

}
