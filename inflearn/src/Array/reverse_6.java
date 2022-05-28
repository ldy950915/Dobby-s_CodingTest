package Array;

import java.util.Scanner;

/*
6. 뒤집은 소수
설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

*/

public class reverse_6 {

	public String solution(int num , int[] arr) {
		String answer = "";

		String str = "";
		for(int i = 0; i<arr.length; i++) {
			str = new StringBuilder(Integer.toString(arr[i])).reverse().toString();
			
			arr[i] = Integer.parseInt(str); //int 배열에 담기
			boolean chk = false;
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					chk = true;
				}
			}
			if(chk == false) {
				if(arr[i]!=1 ) {
					answer += arr[i] + " ";					
				}
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		reverse_6 R = new reverse_6();
		
		Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int[] arr = new int[input1];
	    
	    for(int i=0;i<arr.length; i++) {
	    	arr[i] = in.nextInt();
	    }
	    
	    System.out.println(R.solution(input1, arr));
	}

}
