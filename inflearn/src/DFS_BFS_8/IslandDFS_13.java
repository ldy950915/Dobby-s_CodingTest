package DFS_BFS_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IslandDFS_13 {
	static int[] dx = {-1,-1,0,1,1,1,0,-1};	//За
	static int[] dy = {0,1,1,1,0,-1,-1,-1};	//ї­
	
	static int n,answer=0;
	static int[][] dis;
	public void DFS(int x,int y, int[][] board){
		for(int i=0;i<8;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0&&nx<n&&ny>=0&&ny<n && board[nx][ny]==1) {
				board[nx][ny]=0;
				DFS(nx,ny,board);
			}
		}
		
	}
	public void solution(int[][] board) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j]=0;
					DFS(i,j,board);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandDFS_13 I = new IslandDFS_13();
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
