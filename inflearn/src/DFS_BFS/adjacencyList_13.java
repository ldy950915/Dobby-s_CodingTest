package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class adjacencyList_13 {
	static int n,m,answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int ch[];	//방문체크
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {	// 1 -> 2 ,3, 4 ,5 만큼 돌게
				if(ch[nv] == 0) {					
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjacencyList_13 A = new adjacencyList_13();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//정점의 수
		m = sc.nextInt();	//간선의 수
		graph = new ArrayList<ArrayList<Integer>>();
		ch = new int[n+1];
		
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>()); // 1 ~ 5번에 해당되는 array list 초기화 
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);	//1->2 , 3, 4 값을 넣어주는것 
		}
		ch[1] = 1;
		A.DFS(1);
		System.out.println(answer);
		
	}

}
