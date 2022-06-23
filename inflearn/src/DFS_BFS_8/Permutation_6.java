package DFS_BFS_8;

import java.util.Scanner;

public class Permutation_6 {
	static int n,m;
	static int[] ch,answer;
	
	public void DFS(int L,int[] arr) {
		if(L==m) {
			for(int x :answer) {
				System.out.print(x +" ");
			}
			System.out.println();
		}else {
			for(int i=0;i<n;i++) {
				if(ch[i]==0) {
					ch[i]=1;
					answer[L] = arr[i];
					DFS(L+1,arr);
					ch[i]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutation_6 P = new Permutation_6();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//3
		m = sc.nextInt();	//2
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		ch = new int[n] ;
		answer = new int[m];
		P.DFS(0,arr);
	}

}
