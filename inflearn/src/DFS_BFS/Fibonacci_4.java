package DFS_BFS;

import java.util.Scanner;

public class Fibonacci_4 {

	static int[] fido;
	public int DFS(int n) {
		if(fido[n] > 0) {
			return fido[n];
		}
		if(n == 1) {
			return fido[n] = 1;
		}else if(n == 2) {
			return fido[n] = 1;
		}else {
			return fido[n] = DFS(n-2)+DFS(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci_4 F = new Fibonacci_4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		fido = new int[n+1];
		F.DFS(n);
		
		for(int i=1;i<=n;i++) {
			System.out.print(F.DFS(i) + " ");			
		}
	}
}
