package string;

import java.util.Scanner;

/*
8. ��ȿ�� �Ӹ����
����

�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.

���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.

���ĺ� �̿��� ���ڵ��� �����մϴ�.


�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.


���
ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.

*/

public class palindrome_8 {
	
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		System.out.println(str);
		String tmp = new StringBuilder(str).reverse().toString();
		System.out.println(tmp);
		if(str.equals(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindrome_8 P = new palindrome_8();
		
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(P.solution(str));
	}

}
