package DFS_BFS_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*class Point{
	public int x,y;
	Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}*/
public class Tomato_12 {
	static int n,m;
	static int[] dx = {-1,0,1,0};	//��
	static int[] dy = {0,1,0,-1};	//��
	static int[][] board , dis;	//���� �迭 , üũ�迭
	static Queue<Point> Q = new LinkedList<Point>();
	public void BFS() {
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i =0;i<4;i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0) {
					board[nx][ny] =1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y]+1; //���� ��ġ���� +1�ؼ� �������ϴ� ��ġ�� ����
				}
			}
		} 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tomato_12 T = new Tomato_12();
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt(); //��
		n = sc.nextInt(); //��
		board = new int[n][m];
		dis = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				board[i][j] = sc.nextInt();	//������ �б�
				if(board[i][j]==1) Q.offer(new Point(i, j));	//���� �丶���� ��� ��ǥ�� Q�� ����
			}
		}
		
		T.BFS();
		
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(board[i][j]==0) flag = false; //bfs�� ������ �������� �丶�䰡 �ִ°��
			}
		}
		if(flag) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		}else {
			System.out.println(-1);
		}
	}

}
