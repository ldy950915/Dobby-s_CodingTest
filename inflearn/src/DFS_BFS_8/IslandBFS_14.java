package DFS_BFS_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IslandBFS_14 {
	static int[] dx = {-1,-1,0,1,1,1,0,-1};	//За
	static int[] dy = {0,1,1,1,0,-1,-1,-1};	//ї­
	
	static int n,answer=0;
	static int[][] dis;
	static Queue<Point> Q = new LinkedList<Point>();
	public void BFS(int x,int y, int[][] board){
		Q.offer(new Point(x, y));
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i=0;i<8;i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=0&&nx<n&&ny>=0&&ny<n && board[nx][ny]==1) {
					board[nx][ny]=0;
					Q.offer(new Point(nx, ny));
				}
			}
			
		}
		
	}
	public void solution(int[][] board) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j]=0;
					BFS(i,j,board);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandBFS_14 I = new IslandBFS_14();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[][] board = new int[n][n];
		dis = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j] = sc.nextInt();
			}
		}
		I.solution(board);
		System.out.println(answer);
	}


}
