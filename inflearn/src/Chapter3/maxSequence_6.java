package Chapter3;

import java.util.Scanner;

//최대 길이 연속 부분 수열
public class maxSequence_6 {

	public int solution(int n,int k , int[] arr) {
		int answer = 0;
		int cnt = 0;	//0을 1로 바꾼 횟수
		int lt =0 ;
		for(int rt =0; rt<n;rt++) {
			if(arr[rt] == 0) cnt++; //rt가 0을 만나면 cnt를 증가시킨다.
			while(cnt > k) {
				if(arr[lt]==0) cnt--; //lt가 0이라면 cnt를 감소시킨다. 
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
