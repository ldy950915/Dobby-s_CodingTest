package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. 큰 수 출력하기
설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
*/
public class BigNumSyso {
	
	public ArrayList<Integer> solution(int n , int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		//0번 무조건 출력
		answer.add(arr[0]);
		for(int i =1; i<n;i++) {
			if(arr[i] > arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigNumSyso B = new BigNumSyso();
		
		Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int[] input2 = new int[input1]; //input1 크지만한 배열만들기
	    for(int i =0;i< input1;i++) {	    	
	    	input2[i] += in.nextInt(); //배열에 넣을 숫자
	    }
	    
	    for(int x : B.solution(input1, input2)) {
	    	System.out.print(x + " ");
	    }
	    
	}

}
