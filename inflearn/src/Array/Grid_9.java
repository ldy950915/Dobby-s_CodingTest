package Array;

import java.util.Scanner;

public class Grid_9 {

	public int solution(int n,int[][] arr) {
		int answer = Integer.MIN_VALUE;//최소값으로 설정
		int row;	//행의합
		int cons;	//열의합
		for(int i=0;i<n;i++) {
			row = cons =0;
			for(int j=0;j<n;j++) {
				row += arr[i][j];	//행 고정 , 열 증가
				cons += arr[j][i];	//행 증가 , 열 고정
			}
			answer = Math.max(answer, row);
			answer = Math.max(answer, cons); //둘중에 큰 값이 answer에 담김
		}
		
		int sum1=0 , sum2 =0;
		for(int k=0;k<n;k++) {
			sum1 += arr[k][k];
			sum2 += arr[k][n-k-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grid_9 G = new Grid_9();
		
		Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int[][] arr = new int[input1][input1];
	    
	    for(int i=0;i<input1;i++) {
	    	for(int j=0;j<input1;j++) {
		    	arr[i][j] = in.nextInt();
		    }
	    }
	    
	    System.out.println(G.solution(input1, arr));
	}

}
