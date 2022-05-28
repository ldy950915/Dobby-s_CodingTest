package Chapter3;

import java.util.Scanner;

public class maxSales_3 {
	
	public int solution(int n, int k, int[] arr) {
		int answer = 0 , sum =0;
		
		for(int i=0; i<k; i++) {	//�ʱ� ������ ���ϱ� 
			sum += arr[i];
		}
		answer = sum; // ó�� k������ ������ �ʱ�ȭ
		
		for(int i=k;i<n;i++) {
			sum += arr[i] - arr[i-k]; //���� i���� i-k�� ���༭ sum�� ������
			answer = Math.max(answer, sum);//answer �̶� sum �߿��� �� ū���� answer�� �־���
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
