package DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graphBFS_14 {

	static int n,m,answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch , dis ;	//방문체크
	
	public void BFS(int v) {
		Queue<Integer> Q= new LinkedList<Integer>();
		ch[v] = 1;
		dis[1] = 0;
		Q.offer(v); //정점 넣기
		while(!Q.isEmpty()) {
			int cv = Q.poll(); // 현재 정점
			for(int nv : graph.get(cv)) {
				if(ch[nv]==0) {
					ch[nv]=0;
					Q.offer(nv);
					dis[nv]= dis[cv]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graphBFS_14 G = new graphBFS_14();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//정점의 수
		m = sc.nextInt();	//간선의 수
		graph = new ArrayList<ArrayList<Integer>>();
		ch = new int[n+1];
		dis = new int[n+1];
		
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>()); // 1 ~ 5번에 해당되는 array list 초기화 
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);	//1->2 , 3, 4 값을 넣어주는것 
		}
		ch[1] = 1;
		G.BFS(1);
		for(int i=2;i<=n;i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
}
