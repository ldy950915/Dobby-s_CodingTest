package DFS_BFS_8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Coin_5 {
	static int n,m,answer = Integer.MAX_VALUE;
	public void DFS(int L, int sum, Integer[] arr) {//L = ��������
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
		n = sc.nextInt();	//��ȣ
		Integer[] arr = new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());	//�迭�� �ݴ�� �������� : int �� Integer ��ü�� �����ؾ���.
		m=sc.nextInt();
		C.DFS(0,0,arr);
		System.out.println(answer);
	}

}
