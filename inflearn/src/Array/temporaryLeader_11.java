package Array;

import java.util.Scanner;

public class temporaryLeader_11 {

	public int solution(int n, int[][]arr) {
		int answer =0;
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {	//고정 학생번호
			int cnt = 0;
			for(int j=1; j<=n;j++) {	//비교할 학생번호
				for(int k=1;k<=5;k++) {	//1~5학년
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i; //학년출력
			}
		}
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temporaryLeader_11 T = new temporaryLeader_11();
		
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    int[][] arr = new int[n+1][6]; //학생번호, 학년
	    
	    for(int i=1;i<=n;i++) {	//학생번호 --> 번호는 1번부터 시작임
	    	for(int j=1;j<=5;j++) {	//학년
	    		arr[i][j] = in.nextInt();
	    	}	    	
	    }
	    
	    System.out.println(T.solution(n, arr));
	}

}
