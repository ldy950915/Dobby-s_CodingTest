package DFS_BFS;

//����Լ� - ���� �켱 Ž��
public class recursiveFunction_1 {
	//���������� �۵��ǹǷ� if~else�� ���߰� �ϱ�!
	public void DFS(int n) {
		if(n==0) {
			return;//void������ ���Ḧ ����.
		}else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveFunction_1 R = new recursiveFunction_1();
		R.DFS(3);
	}

}
