package DFS_BFS;

import java.util.Scanner;

/*
�Է°�
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
*/
public class routeSearch_12 {
	static int n,m,answer = 0;
	static int[][] graph;
	static int ch[];	//�湮üũ
	
	public void DFS(int v) {
		if(v==n) answer++;	//�Է°��� n(������ ��)�� ���� ��� answer +1
		else {
			for(int i=1;i<=n;i++) {
				if(graph[v][i]==1 && ch[i]==0) { //graph[v][i] = v -> i�� ���� ������ ���� �����Ͱ� 1�� ��� ������ ���� && ch[i]�� 0�� ��� ���� �Ȱ��� �뼱
					ch[i] = 1; //�湮�� üũ
					DFS(i);//v->i�� �̵������Ƿ� i�� ����
					ch[i] =0; //�湮üũ ��� // DFS() -> �������� ���ٸ� �ٽ� ���ƿͼ� ch[i] =0;���� �ʱ�ȭ ��Ų��.
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		routeSearch_12 R = new routeSearch_12();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//������ ��
		m = sc.nextInt();	//������ ��
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;	//����׷��� 
		}
		ch[1] = 1;
		R.DFS(1);
		System.out.println(answer);
		
	}

}
