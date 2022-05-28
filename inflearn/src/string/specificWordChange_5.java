package string;

import java.util.Scanner;

public class specificWordChange_5 {

	public String solution(String str) {
		String answer = "";
		char[] c = str.toCharArray(); //���ڹ迭�� ����
		int lt = 0 , rt = str.length() -1 ; //�迭�� 0��° �����̹Ƿ�  -1 �������
		
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(c[rt])) {
				rt--;
			}else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(c);
		//toString()�� ���� ��� Null PointerException(NPE)�� �߻���Ű���� valueOf�� "null"�̶�� ���ڿ��� ó���Ѵ�.

		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		specificWordChange_5 sf = new specificWordChange_5();
		
		Scanner in=new Scanner(System.in);
		String str = in.next();
		
		System.out.println(sf.solution(str));
		
	}

}
