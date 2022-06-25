package DFS_BFS_8;

import java.util.Scanner;

public class Combi_4 {

	static int[] pm;
	static int n,m;
	public void DFS(int L) {
		if(L==m) {
			for(int x : pm) System.out.print(x +" ");
			System.out.println();
		}else {
			for(int i=1;i<=m;i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combi_4 C = new Combi_4();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//¹øÈ£
		m = sc.nextInt();	//È½¼ö
		pm = new int[m];
		C.DFS(0);

	}

}
