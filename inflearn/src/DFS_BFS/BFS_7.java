package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

//���� �켱 Ž�� : ����Ž��
public class BFS_7 {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<Node>();	//LIFO
		Q.offer(root);
		int L = 0; //root node �ʱ�ȭ
		while(!Q.isEmpty()) {	//Q�� ���� ������ ����.
			int len = Q.size();//����
			System.out.print(L + " : ");
			//���� ������ŭ ����
			for(int i=0;i<len;i++) {
				Node cur = Q.poll(); //���� ��� = root
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
