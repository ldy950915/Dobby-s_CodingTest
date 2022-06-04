package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

//넓이 우선 탐색 : 레벨탐색
public class BFS_7 {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<Node>();	//LIFO
		Q.offer(root);
		int L = 0; //root node 초기화
		while(!Q.isEmpty()) {	//Q의 값이 없으면 멈춤.
			int len = Q.size();//레벨
			System.out.print(L + " : ");
			//원소 개수만큼 돌기
			for(int i=0;i<len;i++) {
				Node cur = Q.poll(); //현재 노드 = root
				System.out.print(cur.data + " ");
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.offer(cur.rt);
			}	
			L++;
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BFS_7 B = new BFS_7();
		B.root = new Node(1);
		B.root.lt = new Node(2);
		B.root.rt = new Node(3);
		B.root.lt.lt = new Node(4);
		B.root.lt.rt = new Node(5);
		B.root.rt.lt = new Node(6);
		B.root.rt.rt = new Node(7);
		B.BFS(B.root);
		
	}

}
