package string;

import java.util.Scanner;

/*
9. ���ڸ� ����
����

���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.

���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.

�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.


�Է�
ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.


���
ù �ٿ� �ڿ����� ����մϴ�.
*/
public class OnlyNumber_9 {

	public int solution(String str) {
		int answer = 0;
		char[] c = str.toCharArray(); //���ڹ迭�� ����
		String s = "";
		for(int i = 0; i<c.length;i++) {
			if(Character.isDigit(c[i])) {
				s += c[i];
			}
		}
		answer = Integer.parseInt(s);
		return answer;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlyNumber_9 O = new OnlyNumber_9();
		
		Scanner in=new Scanner(System.in);
	    
		String str = in.next();
		
		System.out.println(O.solution(str));
	}

}
