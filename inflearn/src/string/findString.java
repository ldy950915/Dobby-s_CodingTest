package string;

import java.util.Scanner;

/*

1. ���� ã��
����

�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.

��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.


�Է�
ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.

���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� �ش� ������ ������ ����Ѵ�.
*/
public class findString {

	public int solution(String str , char c) {
		str = str.toLowerCase();
		c = Character.toLowerCase(c); //���ڷ� �����ؼ� lowerCase�� ����
		
		int answer = 0;
		
		/*
		 * for(int i = 0; i < str.length(); i++) { if(str.charAt(i) == c) answer ++ ;
		 * 
		 * }
		 */
		for(char x : str.toCharArray()) {
			if(x==c)
			answer ++ ;
				
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		findString f = new findString();
		
		Scanner in = new Scanner(System.in);
	    String input1 = in.next();
	    char input2 = in.next().charAt(0); //�����ϳ��� ��������
	 
	    System.out.println(f.solution(input1, input2));	    
	}

}
