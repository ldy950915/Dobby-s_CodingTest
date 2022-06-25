package DFS_BFS_8;

import java.util.Scanner;

//메모이제이션
public class Memoization_7 {
	int[][] dy= new int[35][35]; 
	
	//콤비네이션 구하기
	public int DFS(int n, int r) {
		if (dy[n][r] > 0) return dy[n][r];
		if(n==r || r==0) return 1;
		else {
			return dy[n][r] = DFS(n-1,r-1) + DFS(n-1,r);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memoization_7 M = new Memoization_7();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//3
		int r = sc.nextInt();	//2
		
		System.out.println(M.DFS(n,r));
	}

}
