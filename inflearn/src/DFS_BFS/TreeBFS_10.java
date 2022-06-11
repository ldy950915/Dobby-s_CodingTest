package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS_10 {
	Node node;
	public int BFS(Node node) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(node);
		int L =0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0;i<len;i++) {
				Node cur = Q.poll();
				if(cur.lt == null&& cur.rt== null) {
					return L;
				}else {
					if(cur.lt != null) {						
						Q.offer(cur.lt);
					}
					if(cur.rt != null) {						
						Q.offer(cur.rt);
					}
				}
			}
			L++;
		}
		return 0;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeBFS_10 T = new TreeBFS_10();
		T.node = new Node(1);
		T.node.lt = new Node(2);
		T.node.rt = new Node(3);
		T.node.lt.lt = new Node(4);
		T.node.lt.rt = new Node(5);
		System.out.println(T.BFS(T.node));
	}

}
