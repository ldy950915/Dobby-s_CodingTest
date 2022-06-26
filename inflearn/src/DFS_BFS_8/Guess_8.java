package DFS_BFS_8;

import java.util.Scanner;

//수열 추측
public class Guess_8 {
	static int[] p,b,ch;
	static int n,f;
	boolean flag = false;
	int dy[][] = new int[35][35]; // 조합수
	
	//콤비네이션 구하기
	public int combi(int n, int r) {
		if (dy[n][r] > 0) return dy[n][r];
		if(n==r || r==0) return 1;
		else {
			return dy[n][r] = combi(n-1,r-1) + combi(n-1,r);
		}	
	}
	public void DFS(int L , int sum) {
		if(flag==true)return;
		if(L==n) {
			if(sum==f) {
				for(int x : p) {
					System.out.print(x +" ");
					flag = true;
				}
			}
		}
		else {
			// 순열 만들기
			for(int i=1;i<=n;i++) {
				if(ch[i]==0) {
					ch[i]=1;
					p[L]=i;
					DFS(L+1,sum+(p[L]*b[L]));
					ch[i]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guess_8 G = new Guess_8();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//4
		f = sc.nextInt();	//16
		b = new int[n];	//콤비네이션 담을 배열
		p = new int[n]; //순열 담을 배열 
		ch = new int[n+1];//순열 체크 배열
		for(int i=0;i<n;i++) {
			b[i] = G.combi(n-1, i); //3C0 -> 3C3 까지 콤비네이션 저장
		}
		G.DFS(0, 0);
		
	}

}
