package Chapter3;

import java.util.Scanner;

public class consecutiveNaturalNumbers_5 {

	public int solution(int n) {
		int answer =0, cnt =1 ; //cnt : ���ӵ� �ڿ����� ����
		n--; //�������� ����
		
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0) {
				answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		consecutiveNaturalNumbers_5 C = new consecutiveNaturalNumbers_5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		System.out.println(C.solution(n));
	}

}
