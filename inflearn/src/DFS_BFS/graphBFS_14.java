package DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graphBFS_14 {

	static int n,m,answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch , dis ;	//�湮üũ
	
	public void BFS(int v) {
		Queue<Integer> Q= new LinkedList<Integer>();
		ch[v] = 1;
		dis[1] = 0;
		Q.offer(v); //���� �ֱ�
		while(!Q.isEmpty()) {
			int cv = Q.poll(); // ���� ����
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
		n = sc.nextInt();	//������ ��
		m = sc.nextInt();	//������ ��
		graph = new ArrayList<ArrayList<Integer>>();
		ch = new int[n+1];
		dis = new int[n+1];
		
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>()); // 1 ~ 5���� �ش�Ǵ� array list �ʱ�ȭ 
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);	//1->2 , 3, 4 ���� �־��ִ°� 
		}
		ch[1] = 1;
		G.BFS(1);
		for(int i=2;i<=n;i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
}
