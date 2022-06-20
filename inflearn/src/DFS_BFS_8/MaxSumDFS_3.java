package DFS_BFS_8;

import java.util.Scanner;

public class MaxSumDFS_3 {
	static int answer = Integer.MIN_VALUE, n, m;
	public void DFS(int L, int sum,int time, int[] ps, int[] pt) {
		if(time > m) return;
		if(L==n) {
			answer = Math.max(answer, sum);
		}else {
			DFS(L+1,sum+ps[L],time+pt[L], ps, pt);
			DFS(L+1,sum,time, ps, pt);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSumDFS_3 M = new MaxSumDFS_3();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//문제 개수
		m = sc.nextInt();	//시간
		int a[] = new int[n];	//점수
		int b[] = new int[n];	//시간
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		M.DFS(0, 0, 0, a, b);
		
		System.out.println(answer);
	}

}
