package Array;

import java.util.Scanner;

/*
5. �Ҽ�(�����佺�׳׽� ü)
����

�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.

���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.


�Է�
ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.


���
ù �ٿ� �Ҽ��� ������ ����մϴ�.

*/

public class sieveOfEratosthenes_5 {
	
	public int solution(int num) {
		int answer = 0;
		int[] ch = new int[num+1];
		for(int i=2;i<=num;i++) {
			//System.out.println(" i >>> " + i );
			if(ch[i] == 0) {
				answer ++;
				for(int j=i; j<=num;j=j+i) {
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
