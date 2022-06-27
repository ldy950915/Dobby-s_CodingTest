package DFS_BFS_8;

import java.util.Scanner;

public class FindCombination_9 {
	static int n,m;
	static int[] combi;
	public void DFS(int L, int s) {
		if(L==m) {
			for(int x : combi) {
				System.out.print(x +" ");
			}
			System.out.println();
		}else {
			//조합
			for(int i=s;i<=n;i++) {
				combi[L]=i;
				DFS(L+1,i+1);
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindCombination_9 F = new FindCombination_9();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//번호
		m = sc.nextInt();	//뽑는 개수
		combi= new int[m];
		F.DFS(0,1);
	}

}
