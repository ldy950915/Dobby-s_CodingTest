package DFS_BFS_8;

import java.util.Scanner;

public class sameSumSubset_1 {
	static String answer = "NO";
	static int n , total = 0;
	boolean flag = false ; //yes 가 발견되면 나머지 재귀는 return
	public void DFS(int L , int sum, int[] arr) {
		if(flag)return;
		if(sum > total/2) return;
		if(L == n) {
			if((total - sum) == sum) {
				answer = "YES";
				flag = true;
			}
		}else {
			DFS(L+1 ,sum+arr[L] ,arr);	//왼쪽
			DFS(L+1 ,sum ,arr);			//오른쪽
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sameSumSubset_1 S = new sameSumSubset_1();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n;i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		
		S.DFS(0,0,arr);
		System.out.println(answer);
	}

}
