package DFS_BFS;

class Node{
	int data;
	Node lt , rt ;//����,������ ��ġ����(class�� ��ü �ּ�)
	public Node(int val) {
		data = val;//��
		lt=rt=null;
	}
}
public class DFS_5 {

	Node root;//�ν��Ͻ� ����
	public void DFS(Node root) {
		if(root == null) {//���� ���
			return;
		}else {
			System.out.print(root.data + " ");	
			DFS(root.lt);
			DFS(root.rt);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS_5 D = new DFS_5();
		
		D.root = new Node(1);
		D.root.lt = new Node(2);
		D.root.rt = new Node(3);
		D.root.lt.lt = new Node(4);
		D.root.lt.rt = new Node(5);
		D.root.rt.lt = new Node(6);
		D.root.rt.rt = new Node(7);
		D.DFS(D.root);
	}

}
