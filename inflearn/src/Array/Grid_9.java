package Array;

import java.util.Scanner;

public class Grid_9 {

	public int solution(int n,int[][] arr) {
		int answer = Integer.MIN_VALUE;//�ּҰ����� ����
		int row;	//������
		int cons;	//������
		for(int i=0;i<n;i++) {
			row = cons =0;
			for(int j=0;j<n;j++) {
				row += arr[i][j];	//�� ���� , �� ����
				cons += arr[j][i];	//�� ���� , �� ����
			}
			answer = Math.max(answer, row);
			answer = Math.max(answer, cons); //���߿� ū ���� answer�� ���
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
