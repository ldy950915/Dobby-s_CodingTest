package Array;

import java.util.Scanner;

public class rank_8 {

	public int[] solution(int n,int[] arr){
		int[] answer = new int[n];
		for(int i =0; i<n; i++) {
			int cnt = 1;
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i]) {
					cnt++;	//등수 더하기
				}
			}
			answer[i]= cnt;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rank_8 R = new rank_8();
		
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int[] arr = new int[input1];
	    
	    for(int i =0; i<arr.length; i++) {
	    	arr[i] = in.nextInt();
	    }
	    
	    for(int x : R.solution(input1, arr) ) {
	    	System.out.println( x + " ");
	    }
	}

}
