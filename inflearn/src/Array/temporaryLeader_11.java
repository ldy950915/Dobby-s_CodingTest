package Array;

import java.util.Scanner;

public class temporaryLeader_11 {

	public int solution(int n, int[][]arr) {
		int answer =0;
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {	//���� �л���ȣ
			int cnt = 0;
			for(int j=1; j<=n;j++) {	//���� �л���ȣ
				for(int k=1;k<=5;k++) {	//1~5�г�
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i; //�г����
			}
		}
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temporaryLeader_11 T = new temporaryLeader_11();
		
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    int[][] arr = new int[n+1][6]; //�л���ȣ, �г�
	    
	    for(int i=1;i<=n;i++) {	//�л���ȣ --> ��ȣ�� 1������ ������
	    	for(int j=1;j<=5;j++) {	//�г�
	    		arr[i][j] = in.nextInt();
	    	}	    	
	    }
	    
	    System.out.println(T.solution(n, arr));
	}

}
