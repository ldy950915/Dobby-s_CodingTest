package DFS_BFS_8;

import java.util.Scanner;

//���� ����
public class Guess_8 {
	static int[] p,b,ch;
	static int n,f;
	boolean flag = false;
	int dy[][] = new int[35][35]; // ���ռ�
	
	//�޺���̼� ���ϱ�
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
			// ���� �����
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
		b = new int[n];	//�޺���̼� ���� �迭
		p = new int[n]; //���� ���� �迭 
		ch = new int[n+1];//���� üũ �迭
		for(int i=0;i<n;i++) {
			b[i] = G.combi(n-1, i); //3C0 -> 3C3 ���� �޺���̼� ����
		}
		G.DFS(0, 0);
		
	}

}
