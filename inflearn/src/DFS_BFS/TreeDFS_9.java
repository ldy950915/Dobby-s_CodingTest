package DFS_BFS;

//�ִ� �Ÿ��� ���� BFS ������ Ǫ�µ� DFS ��������
//DFS�� ������ 2���� �־����.
public class TreeDFS_9 {

	Node node;
	public int DFS(int L, Node node) {
		if(node.lt==null && node.rt==null) {	//����,������ �ڽ��� ���� ��� ������ ����
			return L; //���� ����
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
