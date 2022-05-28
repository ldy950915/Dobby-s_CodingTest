package Chapter3;

import java.util.Scanner;

//�ִ� ���� ���� �κ� ����
public class maxSequence_6 {

	public int solution(int n,int k , int[] arr) {
		int answer = 0;
		int cnt = 0;	//0�� 1�� �ٲ� Ƚ��
		int lt =0 ;
		for(int rt =0; rt<n;rt++) {
			if(arr[rt] == 0) cnt++; //rt�� 0�� ������ cnt�� ������Ų��.
			while(cnt > k) {
				if(arr[lt]==0) cnt--; //lt�� 0�̶�� cnt�� ���ҽ�Ų��. 
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		maxSequence_6 M = new maxSequence_6();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
	
		System.out.println(M.solution(n, k, arr));
	}

}
