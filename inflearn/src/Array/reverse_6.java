package Array;

import java.util.Scanner;

/*
6. ������ �Ҽ�
����

N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ �� �� ������ ���� �Ҽ��̸� �� �Ҽ��� ����ϴ� ���α׷��� �ۼ��ϼ���.

���� ��� 32�� �������� 23�̰�, 23�� �Ҽ��̴�. �׷��� 23�� ����Ѵ�. �� 910�� �������� 19�� ����ȭ �ؾ� �Ѵ�.

ù �ڸ������� ���ӵ� 0�� �����Ѵ�.


�Է�
ù �ٿ� �ڿ����� ���� N(3<=N<=100)�� �־�����, �� ���� �ٿ� N���� �ڿ����� �־�����.

�� �ڿ����� ũ��� 100,000�� ���� �ʴ´�.


���
ù �ٿ� ������ �Ҽ��� ����մϴ�. ��¼����� �Էµ� ������� ����մϴ�.

*/

public class reverse_6 {

	public String solution(int num , int[] arr) {
		String answer = "";

		String str = "";
		for(int i = 0; i<arr.length; i++) {
			str = new StringBuilder(Integer.toString(arr[i])).reverse().toString();
			
			arr[i] = Integer.parseInt(str); //int �迭�� ���
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
