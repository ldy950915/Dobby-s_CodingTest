package DFS_BFS;

//최단 거리는 보통 BFS 문제로 푸는데 DFS 연습문제
//DFS는 하위에 2개가 있어야함.
public class TreeDFS_9 {

	Node node;
	public int DFS(int L, Node node) {
		if(node.lt==null && node.rt==null) {	//왼쪽,오른쪽 자식이 없을 경우 레벨을 리턴
			return L; //레벨 리턴
		}else {
			return Math.min(DFS(L+1, node.lt), DFS(L+1,node.rt));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeDFS_9 T = new TreeDFS_9();
		T.node = new Node(1);
		T.node.lt = new Node(2);
		T.node.rt = new Node(3);
		T.node.lt.lt = new Node(4);
		T.node.lt.rt = new Node(5);
		System.out.println(T.DFS(0, T.node));
	}

}
