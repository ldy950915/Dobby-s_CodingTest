package Array;

import java.util.Scanner;

public class Peak_10 {

	int[] dx = {-1,0,1,0};	//행
	int[] dy = {0,1,0,-1};	//열
	public int solution(int n , int[][] arr) {
		int answer = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				boolean flag = true;
				for(int k=0;k<4;k++) {
					int nx = i+dx[k]; //네방향 행좌표
					int ny = j+dy[k]; //네방향 열좌표
					if(nx>=0&& nx<n&& ny>=0&& ny<n && arr[nx][ny] >= arr[i][j]) { //4방향중에 중심보다 큰값이 있는지
						//있으면 
						flag = false;
						break; //하나라도 있으면 멈춤.
					}
				}
				if(flag) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peak_10 P = new Peak_10();
		
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    int[][] arr = new int[n][n];
	    for(int i=0; i<n; i++) {
	    	for(int j=0; j<n; j++) {
		    	arr[i][j] = in.nextInt();
		    }
	    }
	    
	    System.out.println(P.solution(n, arr));
		
	}

}
