package Chapter3;

import java.util.Scanner;

public class maxSales_3 {
	
	public int solution(int n, int k, int[] arr) {
		int answer = 0 , sum =0;
		
		for(int i=0; i<k; i++) {	//초기 연속일 구하기 
			sum += arr[i];
		}
		answer = sum; // 처음 k연속일 값으로 초기화
		
		for(int i=k;i<n;i++) {
			sum += arr[i] - arr[i-k]; //다음 i에서 i-k를 빼줘서 sum에 더해줌
			answer = Math.max(answer, sum);//answer 이랑 sum 중에서 더 큰값을 answer에 넣어줌
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		maxSales_3  M = new maxSales_3();
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int k = in.nextInt();
	    int[] arr = new int[n];
	    for(int i =0; i<n;i++) {
	    	arr[i] = in.nextInt();
	    }
	    System.out.println(M.solution(n, k, arr));
	}

}
