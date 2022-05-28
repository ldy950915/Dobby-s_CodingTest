package Array;

import java.util.Scanner;

public class Score_7 {

	public int solution(int n, int[] arr) {
		int answer =0;
		
		//arr -> 채첨
		//score -> 점수
		//add -> 가산점
		int add = 0;
		for(int i =0; i<n;i++) {
			if(arr[i] == 1) {
				add++;
				answer += add;
			}else {
				add=0;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {

		Score_7 S = new Score_7();
		
		Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int[] arr = new int[input1];
	    for(int i=0;i<arr.length;i++) {
	    	arr[i] = in.nextInt();
	    }
	    
	    System.out.println(S.solution(input1, arr));
	}

}
