package Array;

import java.util.Scanner;

public class mentoring_12 {

	public int solution(int n , int m , int[][] arr) {
		int answer =0;
		int cnt;
		for(int i=1; i<=n;i++) {	
			for(int j=1;j<=n;j++) {	//�񱳴�� �л���ȣ?
				cnt =0;
				for(int k=0;k<m;k++) {	//����Ƚ��
					int pi =0 ,pj =0;
					for(int s=0; s<n;s++) {	//���
						if(arr[k][s] == i) {
							pi = s;
						}
						if(arr[k][s] == j) {
							pj = s;
						}
					}
					if(pi < pj) {
						cnt ++;
					}
					if(m == cnt) {
						answer ++;
					}
					
				}
				
			}	
		}
		
		
		
		return answer;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mentoring_12 M = new mentoring_12();
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();	//�л���
	    int m = in.nextInt();	//�����
	    int[][] arr = new int[m][n];
	    
	    for(int i=0; i<m;i++) {
	    	for(int j=0; j<n;j++) {
	    		arr[i][j] = in.nextInt();
	    	}
	    }
	    
	    System.out.println(M.solution(n, m, arr));
		    
	}

}
