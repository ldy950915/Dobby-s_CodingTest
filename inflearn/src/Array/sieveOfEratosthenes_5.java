package Array;

import java.util.Scanner;

/*
5. 소수(에라토스테네스 체)
설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

1 2 3 4 5 6 7 

입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력
첫 줄에 소수의 개수를 출력합니다.

*/

public class sieveOfEratosthenes_5 {
	
	public int solution(int num) {
		int answer = 0;
		int[] ch = new int[num+1];
		for(int i=2;i<=num;i++) {
			System.out.println(" i >>> " + ch[i] );
			if(ch[i] == 0) {
				answer ++;
				for(int j=i; j<=num;j=j+i) { 	//i값의 배수면 소수가 아니기 때문에 배열에 1로 변경해준다.
					ch[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		sieveOfEratosthenes_5 S = new sieveOfEratosthenes_5();
		
		Scanner in=new Scanner(System.in);
	    int num = in.nextInt();
	    System.out.println(S.solution(num));
	}

}
