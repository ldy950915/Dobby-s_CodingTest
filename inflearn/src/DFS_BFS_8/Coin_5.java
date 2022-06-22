package DFS_BFS_8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Coin_5 {
	static int n,m,answer = Integer.MAX_VALUE;
	public void DFS(int L, int sum, Integer[] arr) {//L = 동전개수
		if(sum>m) return;
		if(sum==m) {
			answer = Math.min(answer, L);
		}else {
			for(int i=0;i<n;i++) {
				DFS(L+1,sum+arr[i],arr);			
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin_5 C = new Coin_5();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//번호
		Integer[] arr = new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());	//배열을 반대로 변경해줌 : int 를 Integer 객체로 변경해야함.
		m=sc.nextInt();
		C.DFS(0,0,arr);
		System.out.println(answer);
	}

}
