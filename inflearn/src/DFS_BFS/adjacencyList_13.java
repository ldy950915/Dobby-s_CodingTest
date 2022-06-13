package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class adjacencyList_13 {
	static int n,m,answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int ch[];	//�湮üũ
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {	// 1 -> 2 ,3, 4 ,5 ��ŭ ����
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
		n = sc.nextInt();	//������ ��
		m = sc.nextInt();	//������ ��
		graph = new ArrayList<ArrayList<Integer>>();
		ch = new int[n+1];
		
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>()); // 1 ~ 5���� �ش�Ǵ� array list �ʱ�ȭ 
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);	//1->2 , 3, 4 ���� �־��ִ°� 
		}
		ch[1] = 1;
		A.DFS(1);
		System.out.println(answer);
		
	}

}
